package xa;
import p.a;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class k1 extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f30445d = new j1(0);
    public static final j1 e = new j1(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30446a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30447b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30448c;

    public k1() {
        ArrayList arrayList = new ArrayList();
        this.f30448c = arrayList;
        this.f30447b = m1.f30464v;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (v0.f30691a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        Date a10;
        switch (this.f30446a) {
            case 0:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                l2Var.R();
                while (l2Var.a0()) {
                    arrayList.add(((i2) this.f30448c).f30432b.a(l2Var));
                }
                l2Var.W();
                int size = arrayList.size();
                Class cls = (Class) this.f30447b;
                if (cls.isPrimitive()) {
                    Object newInstance = Array.newInstance((Class<?>) cls, size);
                    for (int i = 0; i < size; i++) {
                        Array.set(newInstance, i, arrayList.get(i));
                    }
                    return newInstance;
                }
                return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
            case 1:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                ArrayList arrayList2 = (ArrayList) this.f30448c;
                String O = l2Var.O();
                synchronized (arrayList2) {
                    try {
                        int size2 = arrayList2.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size2) {
                                Object obj = arrayList2.get(i10);
                                i10++;
                                DateFormat dateFormat = (DateFormat) obj;
                                TimeZone timeZone = dateFormat.getTimeZone();
                                try {
                                    a10 = dateFormat.parse(O);
                                    dateFormat.setTimeZone(timeZone);
                                } catch (ParseException unused) {
                                    dateFormat.setTimeZone(timeZone);
                                } catch (Throwable th) {
                                    dateFormat.setTimeZone(timeZone);
                                    throw th;
                                }
                            } else {
                                try {
                                    a10 = d2.a(O, new ParsePosition(0));
                                } catch (ParseException e8) {
                                    throw new ab.b(21, a.l("Failed parsing '", O, "' as Date; at path ", l2Var.h0(true)), e8);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ((m1) this.f30447b).getClass();
                return a10;
            case 2:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                Collection collection = (Collection) ((c1) this.f30447b).zza();
                l2Var.R();
                while (l2Var.a0()) {
                    collection.add(((i2) this.f30448c).f30432b.a(l2Var));
                }
                l2Var.W();
                return collection;
            default:
                Object a11 = ((i0) this.f30448c).a(l2Var);
                if (a11 != null) {
                    Class cls2 = (Class) this.f30447b;
                    if (!cls2.isInstance(a11)) {
                        Class<?> cls3 = a11.getClass();
                        String name = cls2.getName();
                        String name2 = cls3.getName();
                        String h02 = l2Var.h0(true);
                        StringBuilder q10 = a.q("Expected a ", name, " but was ", name2, "; at path ");
                        q10.append(h02);
                        throw new ab.b(q10.toString(), 21);
                    }
                }
                return a11;
        }
    }

    public String toString() {
        switch (this.f30446a) {
            case 1:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f30448c).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return a.k("DefaultDateTypeAdapter(", ((SimpleDateFormat) dateFormat).toPattern(), ")");
                }
                return a.k("DefaultDateTypeAdapter(", dateFormat.getClass().getSimpleName(), ")");
            default:
                return super.toString();
        }
    }

    public k1(i0 i0Var, Class cls) {
        this.f30448c = new i2(i0Var, 4);
        this.f30447b = cls;
    }

    public k1(z1 z1Var, i0 i0Var, Class cls) {
        this.f30448c = i0Var;
        this.f30447b = cls;
    }

    public k1(i2 i2Var, c1 c1Var) {
        this.f30448c = i2Var;
        this.f30447b = c1Var;
    }
}
