package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sf extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10603b;

    public sf(px pxVar) {
        this.f10602a = 1;
        Objects.requireNonNull(pxVar);
        this.f10603b = pxVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f10602a) {
            case 1:
                ((px) this.f10603b).f9645p.set(true);
                return;
            case 2:
                ct0 ct0Var = (ct0) this.f10603b;
                ct0Var.getClass();
                if (((Boolean) g9.r.e.f17698c.a(sl.C)).booleanValue()) {
                    ct0Var.a(true);
                    return;
                }
                return;
            case 3:
                ((it0) this.f10603b).b(true);
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f10602a) {
            case 0:
                synchronized (tf.class) {
                    ((tf) this.f10603b).f11339v = networkCapabilities;
                }
                return;
            case 4:
                b21 b21Var = (b21) this.f10603b;
                synchronized (b21Var) {
                    b21Var.f4700c = networkCapabilities;
                }
                return;
            case 5:
                network.getClass();
                networkCapabilities.getClass();
                a6.q.d().a(h6.h.f17863a, "Network capabilities changed: " + networkCapabilities);
                h6.g gVar = (h6.g) this.f10603b;
                gVar.b(h6.h.a(gVar.f17861f));
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f10602a) {
            case 0:
                synchronized (tf.class) {
                    ((tf) this.f10603b).f11339v = null;
                }
                return;
            case 1:
                ((px) this.f10603b).f9645p.set(false);
                return;
            case 2:
                ct0 ct0Var = (ct0) this.f10603b;
                ct0Var.getClass();
                if (((Boolean) g9.r.e.f17698c.a(sl.C)).booleanValue()) {
                    ct0Var.a(false);
                    return;
                }
                return;
            case 3:
                ((it0) this.f10603b).b(false);
                return;
            case 4:
                b21 b21Var = (b21) this.f10603b;
                synchronized (b21Var) {
                    b21Var.f4700c = null;
                }
                return;
            default:
                network.getClass();
                a6.q.d().a(h6.h.f17863a, "Network connection lost");
                h6.g gVar = (h6.g) this.f10603b;
                gVar.b(h6.h.a(gVar.f17861f));
                return;
        }
    }

    public /* synthetic */ sf(int i, Object obj) {
        this.f10602a = i;
        this.f10603b = obj;
    }

    public sf(ct0 ct0Var) {
        this.f10602a = 2;
        Objects.requireNonNull(ct0Var);
        this.f10603b = ct0Var;
    }

    public sf(it0 it0Var) {
        this.f10602a = 3;
        Objects.requireNonNull(it0Var);
        this.f10603b = it0Var;
    }
}
