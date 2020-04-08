/*
 * Copyright (C) 2017/2020 e-voyageurs technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.tock.translator.google

import org.junit.jupiter.api.Test
import java.util.Locale


class GoogleTranslateIntegrationTest {

    @Test
    fun test() {
        val result = GoogleTranslatorEngine.translate("je vais à Paris", Locale.FRENCH, Locale.ENGLISH)
        println(result)
    }
}