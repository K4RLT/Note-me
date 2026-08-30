package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r8 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f10141d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10142f;

    /* renamed from: g, reason: collision with root package name */
    public int f10143g;

    /* renamed from: h, reason: collision with root package name */
    public int f10144h;
    public Rect i;

    /* renamed from: b, reason: collision with root package name */
    public long f10139b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public long f10140c = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f10138a = new int[4];

    /* renamed from: j, reason: collision with root package name */
    public int f10145j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f10146k = -1;

    public static int a(int i, int i10) {
        return (i & 16777215) | ((i10 * 17) << 24);
    }

    public final void b(tk0 tk0Var, boolean z3, Rect rect, int[] iArr) {
        int i;
        int i10;
        int i11 = !z3 ? 1 : 0;
        int width = rect.width();
        int i12 = i11 * width;
        int height = rect.height();
        while (true) {
            int i13 = 0;
            do {
                int i14 = 0;
                for (int i15 = 1; i14 < i15 && i15 <= 64; i15 <<= 2) {
                    if (tk0Var.b() < 4) {
                        i = -1;
                        i10 = 0;
                        break;
                    }
                    i14 = (i14 << 4) | tk0Var.h(4);
                }
                i = i14 & 3;
                if (i14 < 4) {
                    i10 = width;
                } else {
                    i10 = i14 >> 2;
                }
                int min = Math.min(i10, width - i13);
                if (min > 0) {
                    int i16 = i12 + min;
                    Arrays.fill(iArr, i12, i16, this.f10138a[i]);
                    i13 += min;
                    i12 = i16;
                }
            } while (i13 < width);
            i11 += 2;
            if (i11 >= height) {
                return;
            }
            i12 = i11 * width;
            tk0Var.k();
        }
    }
}
