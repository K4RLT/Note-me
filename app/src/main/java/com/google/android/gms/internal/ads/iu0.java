package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class iu0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7223b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7224a = new ArrayList();

    public final void a(View view, vt0 vt0Var) {
        hu0 hu0Var;
        if (view != null) {
            if (f7223b.matcher("Ad overlay").matches()) {
                ArrayList arrayList = this.f7224a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        hu0Var = (hu0) obj;
                        if (hu0Var.f6894a.get() == view) {
                            break;
                        }
                    } else {
                        hu0Var = null;
                        break;
                    }
                }
                if (hu0Var == null) {
                    arrayList.add(new hu0(view, vt0Var));
                    return;
                }
                return;
            }
            q.x.n("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            return;
        }
        q.x.n("FriendlyObstruction is null");
    }
}
