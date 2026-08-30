package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4412a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f4413b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f4414c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4415d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4414c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4415d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString a(java.lang.String r19, java.lang.String r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a9.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static v8 b(String str, Matcher matcher, xk0 xk0Var, ArrayList arrayList) {
        z8 z8Var = new z8();
        try {
            String group = matcher.group(1);
            if (group != null) {
                z8Var.f13108a = x21.c(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    z8Var.f13109b = x21.c(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    c(group3, z8Var);
                    StringBuilder sb2 = new StringBuilder();
                    String n10 = xk0Var.n(StandardCharsets.UTF_8);
                    while (!TextUtils.isEmpty(n10)) {
                        if (sb2.length() > 0) {
                            sb2.append("\n");
                        }
                        sb2.append(n10.trim());
                        n10 = xk0Var.n(StandardCharsets.UTF_8);
                    }
                    z8Var.f13110c = a(str, sb2.toString(), arrayList);
                    return new v8(z8Var.a().a(), z8Var.f13108a, z8Var.f13109b);
                }
                throw null;
            }
            throw null;
        } catch (IllegalArgumentException unused) {
            x21.F("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0076, code lost:
    
        if (r8.equals("middle") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x007d, code lost:
    
        if (r8.equals("center") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0185, code lost:
    
        if (r9.equals("middle") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x018c, code lost:
    
        if (r9.equals("center") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        if (r9.equals("start") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0144, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r9.equals("end") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r9.equals("middle") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        if (r9.equals("line-right") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        if (r9.equals("center") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        if (r9.equals("line-left") != false) goto L78;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x0111. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x004a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r16, com.google.android.gms.internal.ads.z8 r17) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a9.c(java.lang.String, com.google.android.gms.internal.ads.z8):void");
    }

    public static void d(String str, x8 x8Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        char c11;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = x8Var.f12487b;
        int length = spannableStringBuilder.length();
        String str2 = x8Var.f12486a;
        int hashCode = str2.hashCode();
        int i15 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        spannableStringBuilder.setSpan(new q70(x8Var.f12488c), i14, length, 33);
                                    } else {
                                        return;
                                    }
                                } else if (str2.equals("u")) {
                                    spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                                } else {
                                    return;
                                }
                            } else if (str2.equals("c")) {
                                for (String str3 : x8Var.f12489d) {
                                    Map map = f4414c;
                                    if (map.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i14, length, 33);
                                    } else {
                                        Map map2 = f4415d;
                                        if (map2.containsKey(str3)) {
                                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i14, length, 33);
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        } else if (str2.equals("b")) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), i14, length, 33);
                        } else {
                            return;
                        }
                    } else if (str2.equals("ruby")) {
                        int e = e(list2, str, x8Var);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, c.H);
                        int i16 = i14;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < arrayList.size()) {
                            if ("rt".equals(((w8) arrayList.get(i17)).f12167a.f12486a)) {
                                w8 w8Var = (w8) arrayList.get(i17);
                                int e8 = e(list2, str, w8Var.f12167a);
                                if (e8 == i15) {
                                    if (e != i15) {
                                        e8 = e;
                                    } else {
                                        e8 = 1;
                                    }
                                }
                                int i19 = w8Var.f12167a.f12487b - i18;
                                int i20 = w8Var.f12168b - i18;
                                CharSequence subSequence = spannableStringBuilder.subSequence(i19, i20);
                                spannableStringBuilder.delete(i19, i20);
                                spannableStringBuilder.setSpan(new l60(subSequence.toString(), e8), i16, i19, 33);
                                i18 += subSequence.length();
                                i16 = i19;
                            }
                            i17++;
                            i15 = -1;
                        }
                    } else {
                        return;
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (str2.equals("i")) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
            } else {
                return;
            }
        } else if (!str2.equals("")) {
            return;
        }
        ArrayList f10 = f(list2, str, x8Var);
        for (int i21 = 0; i21 < f10.size(); i21++) {
            u8 u8Var = ((y8) f10.get(i21)).f12810v;
            int i22 = u8Var.f11574k;
            if (i22 == -1 && u8Var.f11575l == -1) {
                i = -1;
            } else {
                if (i22 == 1) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (u8Var.f11575l == 1) {
                    c11 = 2;
                } else {
                    c11 = 0;
                }
                i = c11 | c10;
            }
            if (i != -1) {
                int i23 = u8Var.f11574k;
                if (i23 == -1 && u8Var.f11575l == -1) {
                    i13 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    if (i23 == 1) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (u8Var.f11575l == 1) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 | i12;
                }
                an1.i(spannableStringBuilder, new StyleSpan(i13), i14, length);
            } else {
                i10 = 1;
            }
            if (u8Var.f11573j == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
            }
            if (u8Var.f11571g) {
                if (u8Var.f11571g) {
                    an1.i(spannableStringBuilder, new ForegroundColorSpan(u8Var.f11570f), i14, length);
                } else {
                    q.x.o("Font color not defined");
                    return;
                }
            }
            if (u8Var.i) {
                if (u8Var.i) {
                    an1.i(spannableStringBuilder, new BackgroundColorSpan(u8Var.f11572h), i14, length);
                } else {
                    q.x.o("Background color not defined.");
                    return;
                }
            }
            if (u8Var.e != null) {
                an1.i(spannableStringBuilder, new TypefaceSpan(u8Var.e), i14, length);
            }
            int i24 = u8Var.f11576m;
            if (i24 != 1) {
                if (i24 != 2) {
                    if (i24 == 3) {
                        an1.i(spannableStringBuilder, new RelativeSizeSpan(u8Var.f11577n / 100.0f), i14, length);
                    }
                } else {
                    an1.i(spannableStringBuilder, new RelativeSizeSpan(u8Var.f11577n), i14, length);
                }
            } else {
                an1.i(spannableStringBuilder, new AbsoluteSizeSpan((int) u8Var.f11577n, true), i14, length);
            }
            if (u8Var.f11579p) {
                spannableStringBuilder.setSpan(new Object(), i14, length, 33);
            }
        }
    }

    public static int e(List list, String str, x8 x8Var) {
        ArrayList f10 = f(list, str, x8Var);
        for (int i = 0; i < f10.size(); i++) {
            int i10 = ((y8) f10.get(i)).f12810v.f11578o;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static ArrayList f(List list, String str, x8 x8Var) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            u8 u8Var = (u8) list.get(i);
            String str2 = x8Var.f12486a;
            Set set = x8Var.f12489d;
            String str3 = x8Var.f12488c;
            if (u8Var.f11566a.isEmpty() && u8Var.f11567b.isEmpty() && u8Var.f11568c.isEmpty() && u8Var.f11569d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int a10 = u8.a(u8Var.f11569d, u8.a(u8Var.f11567b, u8.a(u8Var.f11566a, 0, 1073741824, str), 2, str2), 4, str3);
                if (a10 != -1 && set.containsAll(u8Var.f11568c)) {
                    size = a10 + (u8Var.f11568c.size() * 4);
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new y8(size, u8Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
