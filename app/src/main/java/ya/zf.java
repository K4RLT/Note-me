package ya;
import e7.d;
import e7.j;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zf extends a {
    public static final Parcelable.Creator<zf> CREATOR = new uf(1);
    public final int A;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f31624u;

    /* renamed from: v, reason: collision with root package name */
    public final Bitmap f31625v;

    /* renamed from: w, reason: collision with root package name */
    public final int f31626w;

    /* renamed from: x, reason: collision with root package name */
    public final int f31627x;

    /* renamed from: y, reason: collision with root package name */
    public final int f31628y;

    /* renamed from: z, reason: collision with root package name */
    public final int f31629z;

    public zf(float[] fArr, Bitmap bitmap, int i, int i10, int i11, int i12, int i13) {
        this.f31624u = fArr;
        this.f31625v = bitmap;
        this.f31626w = i;
        this.f31627x = i10;
        this.f31628y = i11;
        this.f31629z = i12;
        this.A = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        float[] fArr = this.f31624u;
        if (fArr != null) {
            int k4 = e7.k(parcel, 1);
            parcel.writeFloatArray(fArr);
            e7.l(parcel, k4);
        }
        e7.d(parcel, 2, this.f31625v, i);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f31626w);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f31627x);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f31628y);
        e7.j(parcel, 6, 4);
        parcel.writeInt(this.f31629z);
        e7.j(parcel, 7, 4);
        parcel.writeInt(this.A);
        e7.l(parcel, k3);
    }
}
