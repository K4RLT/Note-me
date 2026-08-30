package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import c.o;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.t;
import f.g;
import f.i;
import g.b;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends o {
    public g O;
    public g P;
    public g Q;
    public g R;
    public ResultReceiver S;
    public ResultReceiver T;
    public ResultReceiver U;
    public ResultReceiver V;

    @Override // c.o, f3.a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        this.O = i(new b(4), new f.b(this) { // from class: c7.g0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f3952v;

            {
                this.f3952v = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                Bundle extras2;
                f.a aVar = (f.a) obj;
                switch (i) {
                    case 0:
                        Intent intent = aVar.f16604v;
                        int i10 = com.google.android.gms.internal.play_billing.t.e(intent, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f3952v;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.S;
                        if (resultReceiver != null) {
                            if (intent == null) {
                                extras = null;
                            } else {
                                extras = intent.getExtras();
                            }
                            resultReceiver.send(i10, extras);
                        }
                        int i11 = aVar.f16603u;
                        if (i11 != -1 || i10 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent2 = aVar.f16604v;
                        int i12 = aVar.f16603u;
                        if (intent2 == null) {
                            extras2 = null;
                        } else {
                            extras2 = intent2.getExtras();
                        }
                        if (i12 != -1) {
                            if (extras2 == null) {
                                extras2 = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                            extras2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                        }
                        int i13 = com.google.android.gms.internal.play_billing.t.e(intent2, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f3952v;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.U;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i13, extras2);
                        } else {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i13 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                        }
                        proxyBillingActivityV22.finish();
                        return;
                }
            }
        });
        this.P = i(new b(4), new f.b(this) { // from class: c7.h0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f3960v;

            {
                this.f3960v = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                Bundle extras2;
                f.a aVar = (f.a) obj;
                switch (i) {
                    case 0:
                        Intent intent = aVar.f16604v;
                        int i10 = com.google.android.gms.internal.play_billing.t.e(intent, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f3960v;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.T;
                        if (resultReceiver != null) {
                            if (intent == null) {
                                extras = null;
                            } else {
                                extras = intent.getExtras();
                            }
                            resultReceiver.send(i10, extras);
                        }
                        int i11 = aVar.f16603u;
                        if (i11 != -1 || i10 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent2 = aVar.f16604v;
                        int i12 = aVar.f16603u;
                        if (intent2 == null) {
                            extras2 = null;
                        } else {
                            extras2 = intent2.getExtras();
                        }
                        if (i12 != -1) {
                            if (extras2 == null) {
                                extras2 = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i12);
                            extras2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i12);
                        }
                        int i13 = com.google.android.gms.internal.play_billing.t.e(intent2, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f3960v;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.V;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i13, extras2);
                        } else {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i13 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i13);
                        }
                        proxyBillingActivityV22.finish();
                        return;
                }
            }
        });
        final int i10 = 1;
        this.Q = i(new b(4), new f.b(this) { // from class: c7.g0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f3952v;

            {
                this.f3952v = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                Bundle extras2;
                f.a aVar = (f.a) obj;
                switch (i10) {
                    case 0:
                        Intent intent = aVar.f16604v;
                        int i102 = com.google.android.gms.internal.play_billing.t.e(intent, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f3952v;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.S;
                        if (resultReceiver != null) {
                            if (intent == null) {
                                extras = null;
                            } else {
                                extras = intent.getExtras();
                            }
                            resultReceiver.send(i102, extras);
                        }
                        int i11 = aVar.f16603u;
                        if (i11 != -1 || i102 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i102);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent2 = aVar.f16604v;
                        int i12 = aVar.f16603u;
                        if (intent2 == null) {
                            extras2 = null;
                        } else {
                            extras2 = intent2.getExtras();
                        }
                        if (i12 != -1) {
                            if (extras2 == null) {
                                extras2 = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                            extras2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                        }
                        int i13 = com.google.android.gms.internal.play_billing.t.e(intent2, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f3952v;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.U;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i13, extras2);
                        } else {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i13 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                        }
                        proxyBillingActivityV22.finish();
                        return;
                }
            }
        });
        this.R = i(new b(4), new f.b(this) { // from class: c7.h0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f3960v;

            {
                this.f3960v = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                Bundle extras2;
                f.a aVar = (f.a) obj;
                switch (i10) {
                    case 0:
                        Intent intent = aVar.f16604v;
                        int i102 = com.google.android.gms.internal.play_billing.t.e(intent, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f3960v;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.T;
                        if (resultReceiver != null) {
                            if (intent == null) {
                                extras = null;
                            } else {
                                extras = intent.getExtras();
                            }
                            resultReceiver.send(i102, extras);
                        }
                        int i11 = aVar.f16603u;
                        if (i11 != -1 || i102 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i102);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent2 = aVar.f16604v;
                        int i12 = aVar.f16603u;
                        if (intent2 == null) {
                            extras2 = null;
                        } else {
                            extras2 = intent2.getExtras();
                        }
                        if (i12 != -1) {
                            if (extras2 == null) {
                                extras2 = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i12);
                            extras2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i12);
                        }
                        int i13 = com.google.android.gms.internal.play_billing.t.e(intent2, "ProxyBillingActivityV2").f3946a;
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f3960v;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.V;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i13, extras2);
                        } else {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i13 != 0) {
                            com.google.android.gms.internal.play_billing.t.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i13);
                        }
                        proxyBillingActivityV22.finish();
                        return;
                }
            }
        });
        if (bundle == null) {
            t.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.S = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                g gVar = this.O;
                pendingIntent.getClass();
                IntentSender intentSender = pendingIntent.getIntentSender();
                intentSender.getClass();
                gVar.a(new i(intentSender, null, 0, 0));
                return;
            }
            if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.T = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                g gVar2 = this.P;
                pendingIntent2.getClass();
                IntentSender intentSender2 = pendingIntent2.getIntentSender();
                intentSender2.getClass();
                gVar2.a(new i(intentSender2, null, 0, 0));
                return;
            }
            if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
                PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
                this.U = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
                g gVar3 = this.Q;
                pendingIntent3.getClass();
                IntentSender intentSender3 = pendingIntent3.getIntentSender();
                intentSender3.getClass();
                gVar3.a(new i(intentSender3, null, 0, 0));
                return;
            }
            if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
                PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
                this.V = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
                g gVar4 = this.R;
                pendingIntent4.getClass();
                IntentSender intentSender4 = pendingIntent4.getIntentSender();
                intentSender4.getClass();
                gVar4.a(new i(intentSender4, null, 0, 0));
                return;
            }
            return;
        }
        if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.S = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        }
        if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.T = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
        if (bundle.containsKey("external_offer_flow_result_receiver")) {
            this.U = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
        }
        if (bundle.containsKey("launch_external_link_result_receiver")) {
            this.V = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
        }
    }

    @Override // c.o, f3.a, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.S;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.T;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.U;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.V;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
