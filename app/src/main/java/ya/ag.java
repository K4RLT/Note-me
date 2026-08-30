package ya;
import ga.a;
import wa.e7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ag extends a {
    public static final Parcelable.Creator<ag> CREATOR = new uf(2);

    /* renamed from: u, reason: collision with root package name */
    public final List f31023u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f31024v;

    /* renamed from: w, reason: collision with root package name */
    public final Bitmap f31025w;

    /* renamed from: x, reason: collision with root package name */
    public final List f31026x;

    public ag(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f31023u = arrayList;
        this.f31024v = fArr;
        this.f31025w = bitmap;
        this.f31026x = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.i(parcel, this.f31023u, 1);
        float[] fArr = this.f31024v;
        if (fArr != null) {
            int k4 = e7.k(parcel, 2);
            parcel.writeFloatArray(fArr);
            e7.l(parcel, k4);
        }
        e7.d(parcel, 3, this.f31025w, i);
        List list = this.f31026x;
        if (list != null) {
            int k10 = e7.k(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            e7.l(parcel, k10);
        }
        e7.l(parcel, k3);
    }
}
