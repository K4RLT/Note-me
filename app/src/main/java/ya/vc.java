package ya;
import m.d;
import p.a;
import k1.l0;
import qe.m;
import t2.b;
import y2.c;
import y2.o;
import y2.p;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class vc {
    public static final float a(long j10, float f10, c cVar) {
        float c10;
        long b10 = o.b(j10);
        if (p.a(b10, 4294967296L)) {
            if (cVar.i0() > 1.05d) {
                c10 = o.c(j10) / o.c(cVar.R(f10));
            } else {
                return cVar.D0(j10);
            }
        } else if (p.a(b10, 8589934592L)) {
            c10 = o.c(j10);
        } else {
            return Float.NaN;
        }
        return c10 * f10;
    }

    public static final void b(Spannable spannable, long j10, int i, int i10) {
        if (j10 != 16) {
            spannable.setSpan(new ForegroundColorSpan(l0.F(j10)), i, i10, 33);
        }
    }

    public static final void c(Spannable spannable, long j10, c cVar, int i, int i10) {
        long b10 = o.b(j10);
        if (p.a(b10, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(a.b(cVar.D0(j10)), false), i, i10, 33);
        } else if (p.a(b10, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(o.c(j10)), i, i10, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public static final void d(Spannable spannable, b bVar, int i, int i10) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(m.d(bVar, 10));
            Iterator it = bVar.f25638u.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).f25636a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i10, 33);
        }
    }
}
