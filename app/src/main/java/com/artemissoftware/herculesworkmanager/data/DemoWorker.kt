package com.artemissoftware.herculesworkmanager.data

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.artemissoftware.herculesworkmanager.util.DemoHelper
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class DemoWorker @AssistedInject constructor(
    @Assisted private val context: Context,
    @Assisted private val workerParams: WorkerParameters,
    private val demoHelper: DemoHelper
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        Log.d("TAG", "worker started")

        for(i in 0..demoHelper.counter){
            Log.d("TAG", "worker started $i")
        }
        return Result.success()
    }
}
