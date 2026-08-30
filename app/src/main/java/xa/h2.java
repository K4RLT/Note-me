package xa;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class h2 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f30425c = new j1(4);

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f30426d = new j1(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30427a;

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDateFormat f30428b;

    public h2(int i) {
        this.f30427a = i;
        switch (i) {
            case 1:
                this.f30428b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.f30428b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        TimeZone timeZone;
        Date date;
        Time time;
        switch (this.f30427a) {
            case 0:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                String O = l2Var.O();
                synchronized (this) {
                    SimpleDateFormat simpleDateFormat = this.f30428b;
                    timeZone = simpleDateFormat.getTimeZone();
                    try {
                        try {
                            date = new Date(simpleDateFormat.parse(O).getTime());
                        } finally {
                        }
                    } catch (ParseException e) {
                        throw new ab.b(21, "Failed parsing '" + O + "' as SQL Date; at path " + l2Var.h0(true), e);
                    }
                }
                return date;
            default:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                String O2 = l2Var.O();
                synchronized (this) {
                    SimpleDateFormat simpleDateFormat2 = this.f30428b;
                    timeZone = simpleDateFormat2.getTimeZone();
                    try {
                        try {
                            time = new Time(simpleDateFormat2.parse(O2).getTime());
                        } finally {
                        }
                    } catch (ParseException e8) {
                        throw new ab.b(21, "Failed parsing '" + O2 + "' as SQL Time; at path " + l2Var.h0(true), e8);
                    }
                }
                return time;
        }
    }
}
