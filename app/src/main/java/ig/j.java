package ig;
import x.m;
import q.x;

import com.facebook.ads.AdError;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f18512j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f18513k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f18514l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f18515m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f18516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18517b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18518c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18519d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18520f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18521g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18522h;
    public final boolean i;

    public j(String str, String str2, long j10, String str3, String str4, boolean z3, boolean z9, boolean z10, boolean z11) {
        this.f18516a = str;
        this.f18517b = str2;
        this.f18518c = j10;
        this.f18519d = str3;
        this.e = str4;
        this.f18520f = z3;
        this.f18521g = z9;
        this.i = z10;
        this.f18522h = z11;
    }

    public static int a(String str, boolean z3, int i, int i10) {
        boolean z9;
        while (i < i10) {
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 == (!z3)) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static long b(int i, String str) {
        int a10 = a(str, false, 0, i);
        Pattern pattern = f18515m;
        Matcher matcher = pattern.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (a10 < i) {
            int a11 = a(str, true, a10 + 1, i);
            matcher.region(a10, a11);
            if (i11 == -1 && matcher.usePattern(pattern).matches()) {
                i11 = Integer.parseInt(matcher.group(1));
                i14 = Integer.parseInt(matcher.group(2));
                i15 = Integer.parseInt(matcher.group(3));
            } else if (i12 == -1 && matcher.usePattern(f18514l).matches()) {
                i12 = Integer.parseInt(matcher.group(1));
            } else {
                if (i13 == -1) {
                    Pattern pattern2 = f18513k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i13 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i10 == -1 && matcher.usePattern(f18512j).matches()) {
                    i10 = Integer.parseInt(matcher.group(1));
                }
            }
            a10 = a(str, false, a11 + 1, i);
        }
        if (i10 >= 70 && i10 <= 99) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 <= 69) {
            i10 += AdError.SERVER_ERROR_CODE;
        }
        if (i10 >= 1601) {
            if (i13 != -1) {
                if (i12 >= 1 && i12 <= 31) {
                    if (i11 >= 0 && i11 <= 23) {
                        if (i14 >= 0 && i14 <= 59) {
                            if (i15 >= 0 && i15 <= 59) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(jg.b.e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i10);
                                gregorianCalendar.set(2, i13 - 1);
                                gregorianCalendar.set(5, i12);
                                gregorianCalendar.set(11, i11);
                                gregorianCalendar.set(12, i14);
                                gregorianCalendar.set(13, i15);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            x.m();
                            return 0L;
                        }
                        x.m();
                        return 0L;
                    }
                    x.m();
                    return 0L;
                }
                x.m();
                return 0L;
            }
            x.m();
            return 0L;
        }
        x.m();
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f18516a.equals(this.f18516a) && jVar.f18517b.equals(this.f18517b) && jVar.f18519d.equals(this.f18519d) && jVar.e.equals(this.e) && jVar.f18518c == this.f18518c && jVar.f18520f == this.f18520f && jVar.f18521g == this.f18521g && jVar.f18522h == this.f18522h && jVar.i == this.i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int e = g3.a.e(this.e, g3.a.e(this.f18519d, g3.a.e(this.f18517b, g3.a.e(this.f18516a, 527, 31), 31), 31), 31);
        long j10 = this.f18518c;
        return ((((((((e + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f18520f ? 1 : 0)) * 31) + (!this.f18521g ? 1 : 0)) * 31) + (!this.f18522h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18516a);
        sb2.append('=');
        sb2.append(this.f18517b);
        if (this.f18522h) {
            long j10 = this.f18518c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(((DateFormat) mg.c.f20815a.get()).format(new Date(j10)));
            }
        }
        if (!this.i) {
            sb2.append("; domain=");
            sb2.append(this.f18519d);
        }
        sb2.append("; path=");
        sb2.append(this.e);
        if (this.f18520f) {
            sb2.append("; secure");
        }
        if (this.f18521g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
