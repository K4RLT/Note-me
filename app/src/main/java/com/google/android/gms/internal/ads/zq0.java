package com.google.android.gms.internal.ads;
import ib.d;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class zq0 implements s81, ib.d, ky0, p31, xk1, zn1, ie0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13254u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f13255v;

    public /* synthetic */ zq0(gu1 gu1Var, ns1 ns1Var) {
        this.f13254u = 13;
        this.f13255v = ns1Var;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((zn1[]) this.f13255v)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public jo1 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            zn1 zn1Var = ((zn1[]) this.f13255v)[i];
            if (zn1Var.a(cls)) {
                return zn1Var.b(cls);
            }
        }
        androidx.datastore.preferences.protobuf.s1.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ky0
    public /* synthetic */ Object c() {
        return (cm1) this.f13255v;
    }

    @Override // com.google.android.gms.internal.ads.ky0
    public /* synthetic */ void d(Object obj, FileOutputStream fileOutputStream) {
        ((cm1) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.ky0
    public Object e(FileInputStream fileInputStream) {
        try {
            fo1 o10 = ((dn1) ((cm1) this.f13255v)).o();
            wm1 wm1Var = wm1.f12302a;
            int i = em1.f5727a;
            wm1 wm1Var2 = wm1.f12303b;
            cn1 cn1Var = (cn1) o10;
            cn1Var.getClass();
            qm1 qm1Var = new qm1(fileInputStream);
            dn1 l10 = dn1.l(cn1Var.f5135a, qm1Var, wm1Var2);
            qm1Var.r(0);
            if (dn1.w(l10, true)) {
                return l10;
            }
            throw new IOException(new uo1().getMessage());
        } catch (pn1 e) {
            throw new RuntimeException("Cannot read proto.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.p31
    public Iterator f(mf mfVar, CharSequence charSequence) {
        return new m31(mfVar, charSequence, new lt0(((g31) this.f13255v).O.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        switch (this.f13254u) {
            case 11:
                ((ie) obj).b0((ir) this.f13255v);
                return;
            case 12:
                ((hu1) obj).j((mw1) this.f13255v);
                return;
            default:
                ((hu1) obj).o((ns1) this.f13255v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public Object o(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ((ck1) this.f13255v).e(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        ((rr0) this.f13255v).zza();
    }

    @Override // ib.d
    public /* synthetic */ void w(Exception exc) {
        tw twVar = (tw) this.f13255v;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((cv0) twVar.f11472x).c(2025, -1L, exc);
    }

    public /* synthetic */ zq0(int i, Object obj) {
        this.f13254u = i;
        this.f13255v = obj;
    }

    public /* synthetic */ zq0(gu1 gu1Var, mw1 mw1Var, is1 is1Var) {
        this.f13254u = 12;
        this.f13255v = mw1Var;
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
    }
}
