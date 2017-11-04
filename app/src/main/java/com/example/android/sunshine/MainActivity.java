/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // COMPLETED (1) Create a field to store the weather display TextView
    TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // COMPLETED (3) Create an array of Strings that contain fake weather data
        String[] weatherDataArray = {
                "Today, Nov 4 - Cloudy - 10°C / 20°C",
                "Tomorrow - Rainy - 8°C / 16°C",
                "Mon, Nov 6 - Stormy - 8°C / 12°C",
                "Tue, Nov 7 - Rainy - 10°C / 15°C",
                "Wed, Nov 8 - Cloudy - 13°C / 18°C",
                "Thu, Nov 9 - Sunny - 15°C / 19°C",
                "Fri, Nov 10 - Sunny - 14°C / 19°C",
                "Sat, Nov 11 - Sunny - 13°C / 18°C",
                "Sun, Nov 12 - Cloudy - 10°C / 15°C",
                "Mon, Nov 13 - Sunny - 12°C / 15°C",
                "Tue, Nov 14 - Sunny - 10°C / 15°C"
        };

        // COMPLETED (4) Append each String from the fake weather data array to the TextView
        for (String weatherData : weatherDataArray)
        {
            mWeatherTextView.append(weatherData + "\n\n\n");
        }

    }
}