package ya;
import x.n;
import p.a;
import q.x;
import qe.k;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class b0 {
    public static final int a(Cursor cursor, String str) {
        String str2;
        cursor.getClass();
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    columnNames.getClass();
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i = 0;
                    int i10 = 0;
                    while (i10 < length) {
                        String str4 = columnNames[i10];
                        int i11 = i + 1;
                        if (str4.length() >= str.length() + 2 && (str4.endsWith(concat) || (str4.charAt(0) == '`' && str4.endsWith(str3)))) {
                            columnIndex = i;
                            break;
                        }
                        i10++;
                        i = i11;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            columnNames2.getClass();
            str2 = k.q(columnNames2, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        x.n(a.l("column '", str, "' does not exist. Available columns: ", str2));
        return 0;
    }
}
