package b8;
import m.d;
import m.h;
import m.i;

import android.content.Context;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2567a;

    /* renamed from: b, reason: collision with root package name */
    public final DateFormatSymbols f2568b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2569c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2570d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2571f;

    public q1(Context context) {
        List list;
        String str;
        Object obj;
        context.getClass();
        this.f2567a = context;
        this.f2568b = DateFormatSymbols.getInstance();
        List h3 = qe.h(2, 3, 4, 5, 6, 7, 1);
        ArrayList arrayList = new ArrayList(qe.d(h3, 10));
        Iterator it = h3.iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            String[] weekdays = this.f2568b.getWeekdays();
            weekdays.getClass();
            if (intValue >= 0 && intValue < weekdays.length) {
                str2 = weekdays[intValue];
            }
            str2.getClass();
            if (str2.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String valueOf = String.valueOf(str2.charAt(0));
                valueOf.getClass();
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb2.append((Object) upperCase);
                sb2.append(str2.substring(1));
                str2 = sb2.toString();
            }
            arrayList.add(str2);
        }
        this.f2569c = arrayList;
        List h10 = qe.h(2, 3, 4, 5, 6, 7, 1);
        ArrayList arrayList2 = new ArrayList(qe.d(h10, 10));
        Iterator it2 = h10.iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Number) it2.next()).intValue();
            String[] shortWeekdays = this.f2568b.getShortWeekdays();
            shortWeekdays.getClass();
            if (intValue2 < 0 || intValue2 >= shortWeekdays.length) {
                str = "";
            } else {
                str = shortWeekdays[intValue2];
            }
            str.getClass();
            String i = mf.i(str, ".", "");
            if (i.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                String valueOf2 = String.valueOf(i.charAt(0));
                valueOf2.getClass();
                String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                sb3.append((Object) upperCase2);
                sb3.append(i.substring(1));
                i = sb3.toString();
            }
            if (mf.f.u(i)) {
                ArrayList arrayList3 = this.f2569c;
                int i10 = intValue2 - 1;
                if (i10 < 0 || i10 >= arrayList3.size()) {
                    obj = "";
                } else {
                    obj = arrayList3.get(i10);
                }
                i = mf.f.H(3, (String) obj);
            }
            arrayList2.add(i);
        }
        this.f2570d = arrayList2;
        ArrayList arrayList4 = this.f2569c;
        ArrayList arrayList5 = new ArrayList(qe.d(arrayList4, 10));
        int size = arrayList4.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            String upperCase3 = mf.f.H(1, (String) obj2).toUpperCase(Locale.ROOT);
            upperCase3.getClass();
            arrayList5.add(upperCase3);
        }
        this.e = arrayList5;
        String[] months = this.f2568b.getMonths();
        months.getClass();
        if (12 >= months.length) {
            list = qe.k.t(months);
        } else {
            ArrayList arrayList6 = new ArrayList(12);
            int i12 = 0;
            for (String str3 : months) {
                arrayList6.add(str3);
                i12++;
                if (i12 == 12) {
                    break;
                }
            }
            list = arrayList6;
        }
        List<String> list2 = list;
        ArrayList arrayList7 = new ArrayList(qe.d(list2, 10));
        for (String str4 : list2) {
            str4.getClass();
            if (str4.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                String valueOf3 = String.valueOf(str4.charAt(0));
                valueOf3.getClass();
                String upperCase4 = valueOf3.toUpperCase(Locale.ROOT);
                upperCase4.getClass();
                sb4.append((Object) upperCase4);
                sb4.append(str4.substring(1));
                str4 = sb4.toString();
            }
            arrayList7.add(str4);
        }
        this.f2571f = arrayList7;
    }

    public final String a(int i) {
        String string = this.f2567a.getString(i);
        string.getClass();
        return string;
    }
}
