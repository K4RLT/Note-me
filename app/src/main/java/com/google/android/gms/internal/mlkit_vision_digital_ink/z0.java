package com.google.android.gms.internal.mlkit_vision_digital_ink;
import i0.a;
import q1.b;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements da {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15319u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.c f15320v;

    public /* synthetic */ z0(com.google.android.gms.internal.consent_sdk.c cVar, int i) {
        this.f15319u = i;
        this.f15320v = cVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public final ya zza() {
        km kmVar;
        x1 e;
        int i = this.f15319u;
        com.google.android.gms.internal.consent_sdk.c cVar = this.f15320v;
        switch (i) {
            case 0:
                y0 y0Var = new y0(cVar, 0);
                int i10 = g2.f14354a;
                return n5.n(n5.q((ya) cVar.f13372w, new r0(b(), 3, y0Var), (eb) cVar.f13374y));
            default:
                ya yaVar = (ya) cVar.f13372w;
                h1 h1Var = (h1) cVar.f13373x;
                String str = (String) cVar.f13371v;
                i iVar = (i) cVar.f13375z;
                Uri uri = (Uri) n5.r(yaVar);
                try {
                    try {
                        try {
                            ((jm) cVar.A).getClass();
                            e = jm.e("Read " + str);
                        } catch (IOException e8) {
                            return n5.l(e8);
                        }
                    } catch (FileNotFoundException e10) {
                        if (!iVar.g(uri)) {
                            kmVar = h1Var.f14389a;
                        } else {
                            throw e10;
                        }
                    }
                    try {
                        InputStream inputStream = (InputStream) iVar.c(uri, a());
                        try {
                            nn a10 = ((in) ((mo) ((nn) h1Var.f14389a).q(7, null))).a(inputStream, h1Var.f14390b);
                            in.b(a10);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            e.close();
                            kmVar = a10;
                            return n5.m(kmVar);
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    throw tl.d(iVar, uri, e11, str);
                }
        }
    }
}
