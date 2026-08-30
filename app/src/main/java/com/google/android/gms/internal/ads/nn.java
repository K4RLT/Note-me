package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nn extends tn {
    public static final int C;
    public static final int D;
    public final int A;
    public final int B;

    /* renamed from: u, reason: collision with root package name */
    public final String f8776u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f8777v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f8778w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8779x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8780y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8781z;

    static {
        int rgb = Color.rgb(12, 174, 206);
        C = Color.rgb(204, 204, 204);
        D = rgb;
    }

    public nn(String str, List list, Integer num, Integer num2, Integer num3, int i, int i10) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        int i11;
        int i12;
        int i13;
        this.f8777v = new ArrayList();
        this.f8778w = new ArrayList();
        this.f8776u = str;
        for (int i14 = 0; i14 < list.size(); i14++) {
            pn pnVar = (pn) list.get(i14);
            this.f8777v.add(pnVar);
            this.f8778w.add(pnVar);
        }
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = C;
        }
        this.f8779x = i11;
        if (num2 != null) {
            i12 = num2.intValue();
        } else {
            i12 = D;
        }
        this.f8780y = i12;
        if (num3 != null) {
            i13 = num3.intValue();
        } else {
            i13 = 12;
        }
        this.f8781z = i13;
        this.A = i;
        this.B = i10;
    }

    @Override // com.google.android.gms.internal.ads.un
    public final String zza() {
        return this.f8776u;
    }

    @Override // com.google.android.gms.internal.ads.un
    public final ArrayList zzb() {
        return this.f8778w;
    }
}
