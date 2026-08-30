package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class s8 implements p7 {

    /* renamed from: y, reason: collision with root package name */
    public static final l7 f10547y;

    /* renamed from: u, reason: collision with root package name */
    public final xk0 f10548u = new xk0();

    /* renamed from: v, reason: collision with root package name */
    public final xk0 f10549v = new xk0();

    /* renamed from: w, reason: collision with root package name */
    public final r8 f10550w;

    /* renamed from: x, reason: collision with root package name */
    public Inflater f10551x;

    static {
        b51 b51Var = d51.f5314v;
        f10547y = new l7(y51.f12781y, -9223372036854775807L, -9223372036854775807L);
    }

    public s8(List list) {
        int i;
        r8 r8Var = new r8();
        this.f10550w = r8Var;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = bq0.f4860a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                r8Var.f10142f = new int[split.length];
                for (int i10 = 0; i10 < split.length; i10++) {
                    int[] iArr = r8Var.f10142f;
                    try {
                        i = Integer.parseInt(split[i10].trim(), 16);
                    } catch (RuntimeException e) {
                        x21.K("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i10] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    StringBuilder sb2 = new StringBuilder(str2.length() + 36);
                    sb2.append("Ignoring malformed IDX size line: '");
                    sb2.append(str2);
                    sb2.append("'");
                    x21.F("VobsubParser", sb2.toString());
                } else {
                    try {
                        r8Var.f10143g = Integer.parseInt(split2[0]);
                        r8Var.f10144h = Integer.parseInt(split2[1]);
                        r8Var.f10141d = true;
                    } catch (RuntimeException e8) {
                        x21.K("VobsubParser", "Parsing IDX failed", e8);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x00c1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c0  */
    @Override // com.google.android.gms.internal.ads.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(int r27, int r28, com.google.android.gms.internal.ads.r7 r29, byte[] r30) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s8.w(int, int, com.google.android.gms.internal.ads.r7, byte[]):void");
    }
}
