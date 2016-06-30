package com.example.ram.sunshine;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**.
 */
    public class forecastfragment extends Fragment {


    public void ForecastFragment() {
        // Required empty public
        // constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_blank, container, false);
        ListView myview = (ListView) rootview.findViewById(R.id.my_list);
        setHasOptionsMenu(true);

        String[] fake = {"Today-sunny 54",
                "monday-clody 20",
                "Tuesday-rainy 54 ",
                "Today-sunny 54",
                "monday-clody 20",
                "Tuesday-rainy 54 ",

        };

        List<String> fakeArray = new ArrayList<String>(Arrays.asList(fake));
        ArrayAdapter mAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_layout,
                R.id.list_item_text, fakeArray);
                myview.setAdapter(mAdapter);

        return rootview;
    }





    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_refresh)
        {
            FetchWeatherTask weathertask = new FetchWeatherTask();
            weathertask.execute("500001");

            return (true);

        }
        return super.onOptionsItemSelected(item);
    }



    public class FetchWeatherTask extends AsyncTask<String,Void,Void>
    {
        private final String LOG_TAG = FetchWeatherTask.class.getSimpleName();


        protected Void doInBackground(String... params) {

            if(params.length==0){
                return  null;
            }

            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;
            String forecastJsonStr = null;

            String format="json";
            String units="metric";
            int number=7;

            try {


                final String FORECAST_BASE_URL = "http://api.openweathermap.org/data/2.5/forecast/city?id=1269843&cnt=7&APPID=145b06c98f03796e1959aed1c0c8f42b";
                final String QUERY_PARAM="q";
                final String FORMAT_PARAM="mode";
                final String UNITS_PARAM="units";
                final String DAYS_PARAM="cnt";
               // final String APPID_PARAM="APPID";

                Uri builtUri =  Uri.parse(FORECAST_BASE_URL).buildUpon()
                        .appendQueryParameter(QUERY_PARAM, params[0])
                        .appendQueryParameter(FORMAT_PARAM,format)
                        .appendQueryParameter(UNITS_PARAM,units)
                        .appendQueryParameter(DAYS_PARAM,Integer.toString(number))
                       // .appendQueryParameter(APPID_PARAM, (String) BuildConfig.OPEN_WEATHER_MAP_API_KEY)
                        .build();
                URL url=new URL(builtUri.toString());
                Log.v(LOG_TAG, "Built URI"+builtUri.toString() );


                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();
                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null)

                {
                    return null;
                }

                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {

                    buffer.append(line + "\n");
                }

                if (buffer.length() == 0) {

                    return null;
                }

                forecastJsonStr = buffer.toString();
                Log.v(LOG_TAG,"ForecastJSON String:"+forecastJsonStr);
            } catch (IOException e) {
                Log.e("forecastfragment", "Error ", e);
                // If the code didn't successfully get the weather data, there's no point in attemping
                // to parse it.
                // return null;
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (final IOException e) {
                        Log.e("forecastfragment", "Error closing stream", e);
                    }

                }
            }
            return null;
        }


    }
}