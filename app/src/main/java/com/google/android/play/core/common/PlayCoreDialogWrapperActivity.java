package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: u, reason: collision with root package name */
    public ResultReceiver f15582u;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i10, intent);
        if (i == 0 && (resultReceiver = this.f15582u) != null) {
            if (i10 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i10 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        PendingIntent pendingIntent = null;
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.f15582u = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                pendingIntent = (PendingIntent) extras.get("confirmation_intent");
            }
            if (extras != null && pendingIntent != null) {
                try {
                    playCoreDialogWrapperActivity = this;
                    try {
                        playCoreDialogWrapperActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                    } catch (IntentSender.SendIntentException unused) {
                        ResultReceiver resultReceiver = playCoreDialogWrapperActivity.f15582u;
                        if (resultReceiver != null) {
                            resultReceiver.send(3, new Bundle());
                        }
                        finish();
                    }
                } catch (IntentSender.SendIntentException unused2) {
                    playCoreDialogWrapperActivity = this;
                }
            } else {
                ResultReceiver resultReceiver2 = this.f15582u;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f15582u = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f15582u);
    }
}
