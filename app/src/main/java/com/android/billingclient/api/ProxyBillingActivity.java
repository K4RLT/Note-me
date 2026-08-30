package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import ba.r;
import c7.c0;
import c7.f;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.t;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: u, reason: collision with root package name */
    public ResultReceiver f4139u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4140v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4141w;

    /* renamed from: x, reason: collision with root package name */
    public int f4142x;

    /* renamed from: y, reason: collision with root package name */
    public long f4143y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4144z;

    public static int a(Intent intent, int i) {
        if (intent == null) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 3) {
                        if (i != 4) {
                            return ModuleDescriptor.MODULE_VERSION;
                        }
                        return 116;
                    }
                    return 115;
                }
                return 114;
            }
            return 113;
        }
        if (intent.getExtras() == null) {
            return 22;
        }
        if (i == 5) {
            return 139;
        }
        return 1;
    }

    public final Intent b(int i, long j10) {
        Intent c10 = c();
        c10.putExtra("RESPONSE_CODE", 6);
        c10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        r a10 = f.a();
        a10.f3161u = 6;
        a10.f3163w = "An internal error occurred.";
        f r8 = a10.r();
        int i10 = c0.f3927a;
        c10.putExtra("FAILURE_LOGGING_PAYLOAD", c0.b(i, 2, r8, null, i3.BROADCAST_ACTION_UNSPECIFIED).b());
        c10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        c10.putExtra("billingClientTransactionId", j10);
        c10.putExtra("wasServiceAutoReconnected", this.f4144z);
        return c10;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0013, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            t.g("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f4142x = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f4141w = true;
                    this.f4142x = FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
                }
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f4139u = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.f4142x = FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
            } else {
                pendingIntent = null;
            }
            if (getIntent().hasExtra("billingClientTransactionId")) {
                this.f4143y = getIntent().getLongExtra("billingClientTransactionId", 0L);
            }
            if (getIntent().hasExtra("wasServiceAutoReconnected")) {
                this.f4144z = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
            }
            try {
                this.f4140v = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f4142x, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                t.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.f4139u;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    Intent b10 = b(137, this.f4143y);
                    if (this.f4141w) {
                        b10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(b10);
                }
                this.f4140v = false;
                finish();
                return;
            }
        }
        t.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.f4140v = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f4139u = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.f4141w = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
        this.f4142x = bundle.getInt("activity_code", 100);
        if (bundle.containsKey("billingClientTransactionId")) {
            this.f4143y = bundle.getLong("billingClientTransactionId");
        }
        if (bundle.containsKey("wasServiceAutoReconnected")) {
            this.f4144z = bundle.getBoolean("wasServiceAutoReconnected");
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f4140v) {
            Intent c10 = c();
            c10.putExtra("RESPONSE_CODE", 1);
            c10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f4141w) {
                c10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f4142x;
            if (i == 110 || i == 100) {
                c10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                c10.putExtra("billingClientTransactionId", this.f4143y);
            }
            sendBroadcast(c10);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f4139u;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f4140v);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f4141w);
        bundle.putInt("activity_code", this.f4142x);
        bundle.putLong("billingClientTransactionId", this.f4143y);
        bundle.putBoolean("wasServiceAutoReconnected", this.f4144z);
    }
}
