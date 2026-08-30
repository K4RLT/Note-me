package com.google.android.gms.internal.ads;
import a6.q;
import a6.x;
import ac.a;
import d1.d;
import eb.d1;
import eb.k0;
import eb.v;
import eb.y0;
import h6.a;
import h6.b;
import h6.c;
import h6.i;
import k9.f0;
import lb.s;
import q.d;
import v7.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hg extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6805a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6806b;

    public hg(int i) {
        this.f6805a = i;
        switch (i) {
            case 12:
                return;
            default:
                this.f6806b = lu0.f8151d;
                return;
        }
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((hz) this.f6806b).f6934x).f15599b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = 1;
        switch (this.f6805a) {
            case 0:
                ((ig) this.f6806b).c();
                return;
            case 1:
                ((bi) this.f6806b).d(3);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((io0) this.f6806b).e(new af(i));
                    return;
                }
                return;
            case 3:
                ((ik0) this.f6806b).f7154a.execute(new ac.a(this, 20, context));
                return;
            case 4:
                lu0 lu0Var = (lu0) this.f6806b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    lu0Var.a(true, lu0Var.f8154c);
                    lu0Var.f8153b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        lu0Var.a(false, lu0Var.f8154c);
                        lu0Var.f8153b = false;
                        return;
                    }
                    return;
                }
            case 5:
                if (!isInitialStickyBroadcast()) {
                    pu puVar = (pu) this.f6806b;
                    puVar.k(vu1.a(context, intent, (l50) puVar.E, (AudioDeviceInfo) puVar.D, puVar.j()));
                    return;
                }
                return;
            case 6:
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.c) this.f6806b).f();
                    return;
                }
                return;
            case 7:
                eb.d1 d1Var = (eb.d1) this.f6806b;
                if (intent == null) {
                    eb.k0 k0Var = d1Var.C;
                    eb.d1.d(k0Var);
                    k0Var.D.g("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    eb.k0 k0Var2 = d1Var.C;
                    eb.d1.d(k0Var2);
                    k0Var2.D.g("App receiver called with null action");
                    return;
                }
                if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    eb.k0 k0Var3 = d1Var.C;
                    eb.d1.d(k0Var3);
                    k0Var3.D.g("App receiver called with unknown action");
                    return;
                }
                com.google.android.gms.internal.measurement.v7.a();
                if (d1Var.A.F(null, eb.v.f16436z0)) {
                    eb.k0 k0Var4 = d1Var.C;
                    eb.d1.d(k0Var4);
                    k0Var4.I.g("App receiver notified triggers are available");
                    eb.y0 y0Var = d1Var.D;
                    eb.d1.d(y0Var);
                    a6.x xVar = new a6.x(14);
                    xVar.f297v = d1Var;
                    y0Var.D(xVar);
                    return;
                }
                return;
            case 8:
                context.getClass();
                intent.getClass();
                h6.a aVar = (h6.a) this.f6806b;
                switch (aVar.f17852g) {
                    case 0:
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            a6.q.d().a(h6.b.f17853a, "Received ".concat(action2));
                            switch (action2.hashCode()) {
                                case -1886648615:
                                    if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case -54942926:
                                    if (action2.equals("android.os.action.DISCHARGING")) {
                                        aVar.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case 948344062:
                                    if (action2.equals("android.os.action.CHARGING")) {
                                        aVar.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                case 1019184907:
                                    if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                    case 1:
                        if (intent.getAction() != null) {
                            a6.q.d().a(h6.c.f17854a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode = action3.hashCode();
                                if (hashCode != -1980154005) {
                                    if (hashCode == 490310653 && action3.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                if (action3.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (intent.getAction() != null) {
                            a6.q.d().a(h6.i.f17864a, "Received " + intent.getAction());
                            String action4 = intent.getAction();
                            if (action4 != null) {
                                int hashCode2 = action4.hashCode();
                                if (hashCode2 != -1181163412) {
                                    if (hashCode2 == -730838620 && action4.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                }
                                if (action4.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            case 9:
                is0 is0Var = (is0) this.f6806b;
                synchronized (is0Var) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) is0Var.f7207x).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 10:
                k9.f0 f0Var = (k9.f0) this.f6806b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    f0Var.e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        f0Var.e = false;
                        return;
                    }
                    return;
                }
            case 11:
                ((lb.s) this.f6806b).b(intent);
                return;
            default:
                hz hzVar = (hz) this.f6806b;
                if (hzVar != null && hzVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    hz hzVar2 = (hz) this.f6806b;
                    ((FirebaseMessaging) hzVar2.f6934x).getClass();
                    FirebaseMessaging.b(hzVar2, 0L);
                    ((FirebaseMessaging) ((hz) this.f6806b).f6934x).f15599b.unregisterReceiver(this);
                    this.f6806b = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ hg(int i, Object obj) {
        this.f6805a = i;
        this.f6806b = obj;
    }

    public /* synthetic */ hg(fp fpVar, io0 io0Var) {
        this.f6805a = 2;
        this.f6806b = io0Var;
    }

    public hg(eb.d1 d1Var) {
        this.f6805a = 7;
        this.f6806b = d1Var;
    }
}
