package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes.dex */
public final class we implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12217a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12218b;

    public we() {
        this.f12217a = 0;
        this.f12218b = new Object();
    }

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        int type2;
        byte[] value2;
        int type3;
        byte[] value3;
        int i = this.f12217a;
        int i10 = 0;
        Object obj = this.f12218b;
        switch (i) {
            case 0:
                if (list == null) {
                    ((d91) obj).d("");
                    return;
                }
                try {
                    int size = list.size();
                    while (i10 < size) {
                        ApkChecksum d2 = a7.i.d(list.get(i10));
                        type = d2.getType();
                        if (type == 8) {
                            r61 f10 = r61.f10130f.f();
                            value = d2.getValue();
                            ((d91) obj).d(f10.g(value, value.length));
                            return;
                        }
                        i10++;
                    }
                } catch (Throwable unused) {
                }
                ((d91) obj).d("");
                return;
            case 1:
                d91 d91Var = (d91) obj;
                if (list == null) {
                    d91Var.d(null);
                    return;
                }
                try {
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ApkChecksum d10 = a7.i.d(list.get(i11));
                        type2 = d10.getType();
                        if (type2 == 8) {
                            value2 = d10.getValue();
                            char[] cArr = fg.f6059a;
                            int length = value2.length;
                            char[] cArr2 = new char[length + length];
                            while (i10 < value2.length) {
                                byte b10 = value2[i10];
                                char[] cArr3 = fg.f6059a;
                                int i12 = i10 + i10;
                                cArr2[i12] = cArr3[(b10 & 255) >>> 4];
                                cArr2[i12 + 1] = cArr3[b10 & 15];
                                i10++;
                            }
                            d91Var.d(new String(cArr2));
                            return;
                        }
                    }
                    d91Var.d(null);
                    return;
                } catch (Throwable unused2) {
                    d91Var.d(null);
                    return;
                }
            default:
                d3.h hVar = (d3.h) obj;
                if (list == null) {
                    hVar.a("");
                    return;
                }
                try {
                    int size3 = list.size();
                    while (i10 < size3) {
                        ApkChecksum d11 = a7.i.d(list.get(i10));
                        type3 = d11.getType();
                        if (type3 == 8) {
                            r61 f11 = r61.f10130f.f();
                            value3 = d11.getValue();
                            hVar.a(f11.g(value3, value3.length));
                            return;
                        }
                        i10++;
                    }
                } catch (Throwable unused3) {
                }
                hVar.a("");
                return;
        }
    }

    public /* synthetic */ we(int i, Object obj) {
        this.f12217a = i;
        this.f12218b = obj;
    }
}
