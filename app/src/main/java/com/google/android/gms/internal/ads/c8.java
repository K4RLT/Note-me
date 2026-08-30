package com.google.android.gms.internal.ads;
import c8.a;
import u7.a;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c8 implements p7 {
    public static final Pattern A = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5025u;

    /* renamed from: v, reason: collision with root package name */
    public final u7 f5026v;

    /* renamed from: x, reason: collision with root package name */
    public LinkedHashMap f5028x;

    /* renamed from: y, reason: collision with root package name */
    public float f5029y = -3.4028235E38f;

    /* renamed from: z, reason: collision with root package name */
    public float f5030z = -3.4028235E38f;

    /* renamed from: w, reason: collision with root package name */
    public final xk0 f5027w = new xk0();

    public c8(List list) {
        if (list != null && !list.isEmpty()) {
            this.f5025u = true;
            byte[] bArr = (byte[]) list.get(0);
            Charset charset = StandardCharsets.UTF_8;
            String str = new String(bArr, charset);
            b80.l(str.startsWith("Format:"));
            u7 a10 = a(str);
            a10.getClass();
            this.f5026v = a10;
            a(new xk0((byte[]) list.get(1)), charset);
            return;
        }
        this.f5025u = false;
        this.f5026v = null;
    }

    public static long b(String str) {
        Matcher matcher = A.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = bq0.f4860a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    public static int c(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i = size + 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j10));
        if (i == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0293 A[Catch: RuntimeException -> 0x01da, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01da, blocks: (B:52:0x01aa, B:54:0x01b8, B:56:0x01be, B:60:0x01df, B:62:0x01e3, B:63:0x01f2, B:65:0x01f6, B:66:0x0205, B:68:0x0209, B:70:0x0211, B:72:0x023b, B:74:0x023f, B:77:0x0250, B:79:0x0254, B:82:0x0265, B:84:0x0269, B:87:0x027a, B:89:0x027e, B:92:0x028f, B:94:0x0293, B:96:0x029b, B:102:0x02b9, B:100:0x02ac, B:113:0x0219, B:58:0x01c9), top: B:51:0x01aa, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.xk0 r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a(com.google.android.gms.internal.ads.xk0, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x01be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:65:0x01a3, B:67:0x01af, B:74:0x01b6, B:69:0x01cf, B:76:0x01c1), top: B:64:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(int r34, int r35, com.google.android.gms.internal.ads.r7 r36, byte[] r37) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c8.w(int, int, com.google.android.gms.internal.ads.r7, byte[]):void");
    }
}
