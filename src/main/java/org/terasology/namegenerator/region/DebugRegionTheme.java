/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.namegenerator.region;

import java.util.Arrays;
import java.util.List;

/**
 * Simple theme that works without assets
 */
public final class DebugRegionTheme implements RegionTheme {
    @Override
    public List<String> getNames() {
        return Arrays.asList("Chad", "Polynesia", "Uzbekistan", "Palmyra Atoll", "Mauritius", "Principe",
                "Chile", "Morocco", "Niue", "India", "Vanuatu", "Liechtenstein", "Slovakia", "Nauru", "Guam",
                "Turks", "South Africa", "Navassa", "Croatia", "Lithuania", "Palau", "Libya", "Sao Tome", "Arctic",
                "Germany", "Algeria", "Georgia", "Taiwan", "Uganda", "Brunei");
    }
}
