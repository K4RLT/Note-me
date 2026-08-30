package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7373b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7374c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7375d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final o8 f7376f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f7377g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7378h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final j8 f7379j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f7380k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7381l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f7382m;

    public j8(String str, String str2, long j10, long j11, o8 o8Var, String[] strArr, String str3, String str4, j8 j8Var) {
        boolean z3;
        this.f7372a = str;
        this.f7373b = str2;
        this.i = str4;
        this.f7376f = o8Var;
        this.f7377g = strArr;
        if (str2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f7374c = z3;
        this.f7375d = j10;
        this.e = j11;
        str3.getClass();
        this.f7378h = str3;
        this.f7379j = j8Var;
        this.f7380k = new HashMap();
        this.f7381l = new HashMap();
    }

    public static j8 a(String str) {
        return new j8(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static j8 b(String str, long j10, long j11, o8 o8Var, String[] strArr, String str2, String str3, j8 j8Var) {
        return new j8(str, null, j10, j11, o8Var, strArr, str2, str3, j8Var);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            m40 m40Var = new m40();
            m40Var.f8234a = new SpannableStringBuilder();
            m40Var.f8235b = null;
            treeMap.put(str, m40Var);
        }
        CharSequence charSequence = ((m40) treeMap.get(str)).f8234a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j10) {
        long j11 = this.f7375d;
        long j12 = this.e;
        if (j11 == -9223372036854775807L) {
            if (j12 == -9223372036854775807L) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        if (j11 <= j10 && j12 == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= j12) {
            return j11 <= j10 && j10 < j12;
        }
        return true;
    }

    public final j8 d(int i) {
        ArrayList arrayList = this.f7382m;
        if (arrayList != null) {
            return (j8) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f7382m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z3) {
        String str = this.f7372a;
        boolean equals = "p".equals(str);
        if (z3 || equals || ("div".equals(str) && this.i != null)) {
            long j10 = this.f7375d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f7382m != null) {
            for (int i = 0; i < this.f7382m.size(); i++) {
                j8 j8Var = (j8) this.f7382m.get(i);
                boolean z9 = true;
                if (!z3 && !equals) {
                    z9 = false;
                }
                j8Var.f(treeSet, z9);
            }
        }
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f7378h;
        boolean equals = "".equals(str3);
        boolean c10 = c(j10);
        if (true != equals) {
            str = str3;
        }
        if (c10 && "div".equals(this.f7372a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j10, str, arrayList);
        }
    }

    public final void h(long j10, boolean z3, String str, TreeMap treeMap) {
        String str2;
        long j11;
        boolean z9;
        HashMap hashMap = this.f7380k;
        hashMap.clear();
        HashMap hashMap2 = this.f7381l;
        hashMap2.clear();
        String str3 = this.f7372a;
        if (!"metadata".equals(str3)) {
            String str4 = this.f7378h;
            if (true != "".equals(str4)) {
                str2 = str4;
            } else {
                str2 = str;
            }
            if (this.f7374c && z3) {
                SpannableStringBuilder i = i(str2, treeMap);
                String str5 = this.f7373b;
                str5.getClass();
                i.append((CharSequence) str5);
                return;
            }
            if ("br".equals(str3) && z3) {
                i(str2, treeMap).append('\n');
                return;
            }
            if (c(j10)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    CharSequence charSequence = ((m40) entry.getValue()).f8234a;
                    charSequence.getClass();
                    hashMap.put(str6, Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i10 = 0; i10 < e(); i10++) {
                    j8 d2 = d(i10);
                    if (z3 || equals) {
                        j11 = j10;
                        z9 = true;
                    } else {
                        j11 = j10;
                        z9 = false;
                    }
                    d2.h(j11, z9, str2, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder i11 = i(str2, treeMap);
                    int length = i11.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (i11.charAt(length) == ' ');
                    if (length >= 0 && i11.charAt(length) != '\n') {
                        i11.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    String str7 = (String) entry2.getKey();
                    CharSequence charSequence2 = ((m40) entry2.getValue()).f8234a;
                    charSequence2.getClass();
                    hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j8.j(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }
}
