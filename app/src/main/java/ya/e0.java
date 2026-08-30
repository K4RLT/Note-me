package ya;
import g5.q;
import p5.c;
import qe.l;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e0 {
    public static final int a(c cVar, String str) {
        cVar.getClass();
        int columnCount = cVar.getColumnCount();
        int i = 0;
        while (true) {
            if (i < columnCount) {
                if (str.equals(cVar.getColumnName(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            return i;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = cVar.getColumnCount();
        int i10 = 0;
        while (true) {
            if (i10 < columnCount2) {
                if (str2.equals(cVar.getColumnName(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = cVar.getColumnCount();
            String concat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i11 = 0; i11 < columnCount3; i11++) {
                String columnName = cVar.getColumnName(i11);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(concat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static final int b(c cVar, String str) {
        cVar.getClass();
        int a10 = a(cVar, str);
        if (a10 >= 0) {
            return a10;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(cVar.getColumnName(i));
        }
        q.c(93, str, "' does not exist. Available columns: [", l.B(arrayList, null, null, null, null, 63), "Column '");
        return 0;
    }
}
