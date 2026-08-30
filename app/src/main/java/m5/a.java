package m5;

import android.os.Bundle;
import i0.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import pe.j;
import qe.l;
import wa.la;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20610a = new LinkedHashSet();

    public a(m mVar) {
        mVar.m("androidx.savedstate.Restarter", this);
    }

    @Override // m5.d
    public final Bundle a() {
        ArrayList<String> arrayList;
        Bundle a10 = la.a((j[]) Arrays.copyOf(new j[0], 0));
        List P = l.P(this.f20610a);
        if (P instanceof ArrayList) {
            arrayList = (ArrayList) P;
        } else {
            arrayList = new ArrayList<>(P);
        }
        a10.putStringArrayList("classes_to_restore", arrayList);
        return a10;
    }
}
