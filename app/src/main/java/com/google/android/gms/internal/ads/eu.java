package com.google.android.gms.internal.ads;
import g3.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class eu {

    /* renamed from: b, reason: collision with root package name */
    public static final eu f5807b = new eu(new a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final a f5808c;

    /* renamed from: a, reason: collision with root package name */
    public final a[] f5809a;

    static {
        a aVar = new a(-1, new int[0], new y4[0], new long[0], new String[0], new ye[0]);
        int[] iArr = aVar.f4290d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        y4[] y4VarArr = (y4[]) Arrays.copyOf(aVar.f4289c, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f4291f, 0);
        ye[] yeVarArr = aVar.f4292g;
        f5808c = new a(0, copyOf, y4VarArr, copyOf2, strArr, (ye[]) Arrays.copyOf(yeVarArr, Math.max(0, yeVarArr.length)));
        String str = bq0.f4860a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public eu(a[] aVarArr) {
        this.f5809a = aVarArr;
    }

    public final a a(int i) {
        if (i < 0) {
            return f5808c;
        }
        return this.f5809a[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && eu.class == obj.getClass() && Arrays.equals(this.f5809a, ((eu) obj).f5809a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5809a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return a.k("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
