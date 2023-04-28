package com.artemissoftware.herculesworkmanager.data

import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

class Demonstration constructor(
    private val workManager: WorkManager,
) {

    fun demo() {
        val request = OneTimeWorkRequestBuilder<DemoWorker>().build()

        workManager
            .enqueue(request)

//        workManager.beginUniqueWork(
//            "WORK_NAME",
//            ExistingWorkPolicy.APPEND_OR_REPLACE,
//            request,
//        ).enqueue()
    }
}
