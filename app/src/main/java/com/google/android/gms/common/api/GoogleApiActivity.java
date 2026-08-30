package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import bb.a;
import ca.b;
import ca.e;
import ea.d;
import fa.y;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f4279v = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f4280u = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4280u = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                d e = d.e(this);
                if (i10 != -1) {
                    if (i10 == 0) {
                        e.f(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    a aVar = e.G;
                    aVar.sendMessage(aVar.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.f4280u = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f4280u = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4280u = bundle.getInt("resolution");
        }
        if (this.f4280u != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        googleApiActivity.f4280u = 1;
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        if (extras.getBoolean("notify_manager", true)) {
                            d.e(this).f(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String k3 = p.a.k("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                k3 = k3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", k3, e);
                        }
                        googleApiActivity.f4280u = 1;
                        finish();
                    } catch (IntentSender.SendIntentException e8) {
                        e = e8;
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                    }
                } catch (ActivityNotFoundException e10) {
                    e = e10;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e11) {
                    e = e11;
                }
            } else {
                y.h(num);
                e.f4034d.d(this, num.intValue(), this);
                this.f4280u = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4280u);
        super.onSaveInstanceState(bundle);
    }
}
