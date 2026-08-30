package fa;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import wa.e7;

/* loaded from: classes.dex */
public final class r extends ga.a {
    public static final Parcelable.Creator<r> CREATOR = new c9.f(19);

    /* renamed from: u, reason: collision with root package name */
    public final int f16912u;

    /* renamed from: v, reason: collision with root package name */
    public final Account f16913v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16914w;

    /* renamed from: x, reason: collision with root package name */
    public final GoogleSignInAccount f16915x;

    public r(int i, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f16912u = i;
        this.f16913v = account;
        this.f16914w = i10;
        this.f16915x = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f16912u);
        e7.d(parcel, 2, this.f16913v, i);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f16914w);
        e7.d(parcel, 4, this.f16915x, i);
        e7.l(parcel, k3);
    }
}
