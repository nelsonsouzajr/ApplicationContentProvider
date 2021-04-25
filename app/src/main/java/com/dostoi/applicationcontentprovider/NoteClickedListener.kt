package com.dostoi.applicationcontentprovider

import android.database.Cursor

interface NoteClickedListener {

    fun notClickedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}