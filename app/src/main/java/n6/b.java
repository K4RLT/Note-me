package n6;

import a6.q;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import g5.a0;
import j6.g;
import j6.i;
import j6.j;
import j6.l;
import j6.p;
import j6.s;
import java.util.ArrayList;
import wa.y8;
import ya.c0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21152a = q.f("DiagnosticsWrkr");

    public static final String a(l lVar, s sVar, i iVar, ArrayList arrayList) {
        Integer num;
        String str;
        String string;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p pVar = (p) obj;
            j a10 = y8.a(pVar);
            String str2 = pVar.f18944a;
            g g8 = iVar.g(a10);
            if (g8 != null) {
                num = Integer.valueOf(g8.f18922c);
            } else {
                num = null;
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f18933v;
            a0 k3 = a0.k(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                k3.g(1);
            } else {
                k3.n(1, str2);
            }
            workDatabase_Impl.b();
            Cursor d2 = c0.d(workDatabase_Impl, k3, false);
            try {
                ArrayList arrayList2 = new ArrayList(d2.getCount());
                while (d2.moveToNext()) {
                    if (d2.isNull(0)) {
                        string = null;
                    } else {
                        string = d2.getString(0);
                    }
                    arrayList2.add(string);
                }
                d2.close();
                k3.m();
                String B = qe.l.B(arrayList2, ",", null, null, null, 62);
                String B2 = qe.l.B(sVar.c(str2), ",", null, null, null, 62);
                StringBuilder sb3 = new StringBuilder("\n");
                sb3.append(str2);
                sb3.append("\t ");
                sb3.append(pVar.f18946c);
                sb3.append("\t ");
                sb3.append(num);
                sb3.append("\t ");
                switch (pVar.f18945b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sb3.append(str);
                sb3.append("\t ");
                sb3.append(B);
                sb3.append("\t ");
                sb3.append(B2);
                sb3.append('\t');
                sb2.append(sb3.toString());
            } catch (Throwable th) {
                d2.close();
                k3.m();
                throw th;
            }
        }
        return sb2.toString();
    }
}
