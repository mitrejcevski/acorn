/*
 *    Copyright 2018 Niek Haarman
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.nhaarman.acorn.samples.hellostartactivity

import com.nhaarman.acorn.presentation.Container
import com.nhaarman.acorn.presentation.Scene

interface MapsContainer : Container {

    fun addFinishedEventListener(f: () -> Unit)

    fun removeFinishedEventListener(f: () -> Unit)
}

class MapsScene(
    private val listener: Events
) : Scene<MapsContainer> {

    private val finishListener = { listener.mapsFinished() }

    override fun attach(v: MapsContainer) {
        v.addFinishedEventListener(finishListener)
    }

    override fun detach(v: MapsContainer) {
        v.removeFinishedEventListener(finishListener)
    }

    interface Events {

        fun mapsFinished()
    }
}
