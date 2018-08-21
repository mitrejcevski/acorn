package com.nhaarman.bravo.notesapp.android

import com.nhaarman.bravo.BravoBundle
import com.nhaarman.bravo.android.navigation.AbstractNavigatorProvider
import com.nhaarman.bravo.notesapp.NotesAppComponent
import com.nhaarman.bravo.notesapp.navigation.NoteAppNavigator

class NotesAppNavigatorProvider(
    private val notesAppComponent: NotesAppComponent
) : AbstractNavigatorProvider<NoteAppNavigator>() {

    override fun createNavigator(savedState: BravoBundle?): NoteAppNavigator {
        return NoteAppNavigator(notesAppComponent, savedState)
    }
}