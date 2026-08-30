package wa;
import wa.ha;

import android.content.Context;
import com.google.android.gms.internal.ads.z11;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ia implements ha {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29693a;

    public ia(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.f29693a = arrayList;
        arrayList.add(new ka(context, gaVar));
    }

    @Override // ha
    public final void a(z11 z11Var) {
        ArrayList arrayList = this.f29693a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ha) obj).a(z11Var);
        }
    }
}
