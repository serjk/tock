/*
 * Copyright (C) 2017 VSCT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.vsct.tock.nlp.shared.jackson

import com.fasterxml.jackson.module.kotlin.readValue
import fr.vsct.tock.shared.jackson.AnyValueWrapper
import fr.vsct.tock.shared.jackson.mapper
import org.junit.Test
import kotlin.test.assertEquals

/**
 *
 */
class AnyValueWrapperTest {

    data class Custom(val name: String)

    @Test
    fun serializeAndDeserializeAnyValueWrapper_shouldLeftDataInchanged() {
        val value = AnyValueWrapper(Custom("ok"))
        val s = mapper.writeValueAsString(value)
        val newValue = mapper.readValue<AnyValueWrapper>(s)
        assertEquals(value, newValue)
    }

    @Test
    fun serializeAndDeserializeNullValueWrapper_shouldLeftDataInchanged() {
        val value = AnyValueWrapper(Custom::class, null)
        val s = mapper.writeValueAsString(value)
        val newValue = mapper.readValue<AnyValueWrapper>(s)
        assertEquals(value, newValue)
    }
}