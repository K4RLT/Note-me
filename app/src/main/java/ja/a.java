package ja;

import android.os.Parcel;
import android.os.Parcelable;
import da.j;
import fa.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import wa.e7;

/* loaded from: classes.dex */
public final class a extends ga.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final List f19093u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f19094v;

    /* renamed from: w, reason: collision with root package name */
    public final String f19095w;

    /* renamed from: x, reason: collision with root package name */
    public final String f19096x;

    public a(ArrayList arrayList, boolean z3, String str, String str2) {
        y.h(arrayList);
        this.f19093u = arrayList;
        this.f19094v = z3;
        this.f19095w = str;
        this.f19096x = str2;
    }

    public static a a(List list, boolean z3) {
        TreeSet treeSet = new TreeSet(b.f19097u);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((j) it.next()).j());
        }
        return new a(new ArrayList(treeSet), z3, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f19094v != aVar.f19094v || !y.l(this.f19093u, aVar.f19093u) || !y.l(this.f19095w, aVar.f19095w) || !y.l(this.f19096x, aVar.f19096x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19094v), this.f19093u, this.f19095w, this.f19096x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.i(parcel, this.f19093u, 1);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f19094v ? 1 : 0);
        e7.e(parcel, 3, this.f19095w);
        e7.e(parcel, 4, this.f19096x);
        e7.l(parcel, k3);
    }
}
