package com.google.android.gms.internal.measurement;
import j6.e;
import j6.n;
import n.i;
import o0.a;
import o0.f;
import o0.j;
import o0.n;
import p.a;
import q.x;

import com.google.android.gms.internal.ads.wd0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p implements n, Iterable {

    /* renamed from: u, reason: collision with root package name */
    public final String f13877u;

    public p(String str) {
        if (str != null) {
            this.f13877u = str;
        } else {
            x.n("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        String str = this.f13877u;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        return this.f13877u;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        return new p(this.f13877u);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new r(this, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f13877u.equals(((p) obj).f13877u);
    }

    public final int hashCode() {
        return this.f13877u.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        return Boolean.valueOf(!this.f13877u.isEmpty());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, n nVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        int i10;
        double doubleValue;
        double a10;
        String b10;
        double d2;
        double min;
        double length;
        double min2;
        long j10;
        int i11;
        int i12;
        int length2;
        int i13;
        n nVar2;
        double doubleValue2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                x.n(str.concat(" is not a String function"));
                return null;
            }
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str4)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                str4 = str2;
                if (str.equals(str6)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str4 = str2;
                    str6 = "toString";
                    c10 = 2;
                    break;
                }
                str4 = str2;
                str6 = "toString";
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    c10 = 3;
                }
                str4 = str2;
                str6 = "toString";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c10 = 4;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c10 = 5;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -906336856:
                if (str.equals("search")) {
                    c10 = 6;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c10 = 7;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = '\b';
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c10 = '\t';
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c10 = '\n';
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    c10 = 11;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = '\f';
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    c10 = '\r';
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c10 = 14;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c10 = 15;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 16;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
        }
        String str7 = "undefined";
        String str8 = str4;
        String str9 = this.f13877u;
        switch (c10) {
            case 0:
                f(1, str8, arrayList);
                n k3 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(0));
                if (!"length".equals(k3.b())) {
                    double doubleValue3 = k3.a().doubleValue();
                    if (doubleValue3 != Math.floor(doubleValue3) || (i = (int) doubleValue3) < 0 || i >= str9.length()) {
                        return n.f13853n;
                    }
                }
                return n.f13852m;
            case 1:
                f(0, str6, arrayList);
                return this;
            case 2:
                f(0, "toLocaleLowerCase", arrayList);
                return new p(str9.toLowerCase());
            case 3:
                n(1, str5, arrayList);
                if (!arrayList.isEmpty()) {
                    i10 = (int) a(((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).a().doubleValue());
                } else {
                    i10 = 0;
                }
                if (i10 >= 0 && i10 < str9.length()) {
                    return new p(String.valueOf(str9.charAt(i10)));
                }
                return n.f13854o;
            case 4:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(str9);
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sb2.append(((e) nVar.f18939w).k(nVar, (n) arrayList.get(i14)).b());
                    }
                    return new p(sb2.toString());
                }
                return this;
            case 5:
                f(0, "toLowerCase", arrayList);
                return new p(str9.toLowerCase(Locale.ENGLISH));
            case 6:
                n(1, "search", arrayList);
                if (!arrayList.isEmpty()) {
                    str7 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b();
                }
                if (Pattern.compile(str7).matcher(str9).find()) {
                    return new g(Double.valueOf(r0.start()));
                }
                return new g(Double.valueOf(-1.0d));
            case 7:
                f(0, "toLocaleUpperCase", arrayList);
                return new p(str9.toUpperCase());
            case '\b':
                n(2, "lastIndexOf", arrayList);
                if (arrayList.size() > 0) {
                    str7 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b();
                }
                if (arrayList.size() < 2) {
                    doubleValue = Double.NaN;
                } else {
                    doubleValue = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(1)).a().doubleValue();
                }
                if (Double.isNaN(doubleValue)) {
                    a10 = Double.POSITIVE_INFINITY;
                } else {
                    a10 = a(doubleValue);
                }
                return new g(Double.valueOf(str9.lastIndexOf(str7, (int) a10)));
            case '\t':
                f(0, "toUpperCase", arrayList);
                return new p(str9.toUpperCase(Locale.ENGLISH));
            case '\n':
                f(0, "toUpperCase", arrayList);
                return new p(str9.trim());
            case 11:
                n(1, "match", arrayList);
                if (arrayList.size() <= 0) {
                    b10 = "";
                } else {
                    b10 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b();
                }
                Matcher matcher = Pattern.compile(b10).matcher(str9);
                if (matcher.find()) {
                    return new d(new p(matcher.group()));
                }
                return i;
            case '\f':
                n(2, "slice", arrayList);
                if (!arrayList.isEmpty()) {
                    d2 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).a().doubleValue();
                } else {
                    d2 = 0.0d;
                }
                double a11 = a(d2);
                if (a11 < 0.0d) {
                    min = Math.max(str9.length() + a11, 0.0d);
                } else {
                    min = Math.min(a11, str9.length());
                }
                int i15 = (int) min;
                if (arrayList.size() > 1) {
                    length = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(1)).a().doubleValue();
                } else {
                    length = str9.length();
                }
                double a12 = a(length);
                if (a12 < 0.0d) {
                    min2 = Math.max(str9.length() + a12, 0.0d);
                } else {
                    min2 = Math.min(a12, str9.length());
                }
                return new p(str9.substring(i15, Math.max(0, ((int) min2) - i15) + i15));
            case '\r':
                n(2, "split", arrayList);
                if (str9.length() == 0) {
                    return new d(this);
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String b11 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b();
                    if (arrayList.size() > 1) {
                        j10 = j(((e) nVar.f18939w).k(nVar, (n) arrayList.get(1)).a().doubleValue()) & 4294967295L;
                    } else {
                        j10 = 2147483647L;
                    }
                    if (j10 == 0) {
                        return new d();
                    }
                    String[] split = str9.split(Pattern.quote(b11), ((int) j10) + 1);
                    int length3 = split.length;
                    if (b11.isEmpty() && split.length > 0) {
                        boolean isEmpty = split[0].isEmpty();
                        i11 = isEmpty;
                        if (split[split.length - 1].isEmpty()) {
                            length3 = split.length - 1;
                            i11 = isEmpty;
                        }
                    } else {
                        i11 = 0;
                    }
                    if (split.length > j10) {
                        length3--;
                    }
                    while (i11 < length3) {
                        arrayList2.add(new p(split[i11]));
                        i11++;
                    }
                }
                return new d(arrayList2);
            case 14:
                n(2, "substring", arrayList);
                if (!arrayList.isEmpty()) {
                    i12 = (int) a(((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).a().doubleValue());
                } else {
                    i12 = 0;
                }
                if (arrayList.size() > 1) {
                    length2 = (int) a(((e) nVar.f18939w).k(nVar, (n) arrayList.get(1)).a().doubleValue());
                } else {
                    length2 = str9.length();
                }
                int min3 = Math.min(Math.max(i12, 0), str9.length());
                int min4 = Math.min(Math.max(length2, 0), str9.length());
                return new p(str9.substring(Math.min(min3, min4), Math.max(min3, min4)));
            case 15:
                n(2, "replace", arrayList);
                boolean isEmpty2 = arrayList.isEmpty();
                n nVar3 = n.f13848h;
                if (!isEmpty2) {
                    str7 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b();
                    if (arrayList.size() > 1) {
                        nVar3 = ((e) nVar.f18939w).k(nVar, (n) arrayList.get(1));
                    }
                }
                int indexOf = str9.indexOf(str7);
                if (indexOf >= 0) {
                    if (nVar3 instanceof j) {
                        i13 = 0;
                        nVar3 = ((j) nVar3).e(nVar, Arrays.asList(new p(str7), new g(Double.valueOf(indexOf)), this));
                    } else {
                        i13 = 0;
                    }
                    return new p(wd0.n(str9.substring(i13, indexOf), nVar3.b(), str9.substring(str7.length() + indexOf)));
                }
                return this;
            case 16:
                n(2, "indexOf", arrayList);
                if (arrayList.size() <= 0) {
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    str7 = ((e) nVar2.f18939w).k(nVar2, (n) arrayList.get(0)).b();
                }
                if (arrayList.size() < 2) {
                    doubleValue2 = 0.0d;
                } else {
                    doubleValue2 = ((e) nVar2.f18939w).k(nVar2, (n) arrayList.get(1)).a().doubleValue();
                }
                return new g(Double.valueOf(str9.indexOf(str7, (int) a(doubleValue2))));
            default:
                x.n("Command not supported");
                return null;
        }
    }

    public final String toString() {
        return a.k("\"", this.f13877u, "\"");
    }
}
