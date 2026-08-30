package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new c9.f(15);

    /* renamed from: u, reason: collision with root package name */
    public final IntentSender f16619u;

    /* renamed from: v, reason: collision with root package name */
    public final Intent f16620v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16621w;

    /* renamed from: x, reason: collision with root package name */
    public final int f16622x;

    public i(IntentSender intentSender, Intent intent, int i, int i10) {
        intentSender.getClass();
        this.f16619u = intentSender;
        this.f16620v = intent;
        this.f16621w = i;
        this.f16622x = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f16619u, i);
        parcel.writeParcelable(this.f16620v, i);
        parcel.writeInt(this.f16621w);
        parcel.writeInt(this.f16622x);
    }
}
