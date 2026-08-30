package e7;

import android.content.Context;
import android.content.SharedPreferences;
import b1.g0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends g0 {

    /* renamed from: z, reason: collision with root package name */
    public static final q f15992z = new g0("bgremove_credits", 3, "bgremove");

    public static void g(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_ads", 0);
        String str2 = "";
        String string = sharedPreferences.getString("bgremove_paid_ids", "");
        if (string != null) {
            str2 = string;
        }
        List D = mf.f.D(str2, new char[]{'\n'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : D) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.remove(str);
        arrayList2.add(str);
        while (arrayList2.size() > 200) {
            arrayList2.remove(0);
        }
        sharedPreferences.edit().putString("bgremove_paid_ids", qe.l.B(arrayList2, "\n", null, null, null, 62)).apply();
    }
}
