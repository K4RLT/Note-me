package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import fa.y;
import ga.a;
import i9.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import wa.e7;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b(13);
    public String A;
    public final long B;
    public final String C;
    public final List D;
    public final String E;
    public final String F;
    public final HashSet G = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final int f4273u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4274v;

    /* renamed from: w, reason: collision with root package name */
    public final String f4275w;

    /* renamed from: x, reason: collision with root package name */
    public final String f4276x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4277y;

    /* renamed from: z, reason: collision with root package name */
    public final Uri f4278z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4273u = i;
        this.f4274v = str;
        this.f4275w = str2;
        this.f4276x = str3;
        this.f4277y = str4;
        this.f4278z = uri;
        this.A = str5;
        this.B = j10;
        this.C = str6;
        this.D = arrayList;
        this.E = str7;
        this.F = str8;
    }

    public static GoogleSignInAccount a(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        y.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.A = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.C.equals(this.C)) {
                        HashSet hashSet = new HashSet(googleSignInAccount.D);
                        hashSet.addAll(googleSignInAccount.G);
                        HashSet hashSet2 = new HashSet(this.D);
                        hashSet2.addAll(this.G);
                        if (hashSet.equals(hashSet2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.C.hashCode() + 527;
        HashSet hashSet = new HashSet(this.D);
        hashSet.addAll(this.G);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4273u);
        e7.e(parcel, 2, this.f4274v);
        e7.e(parcel, 3, this.f4275w);
        e7.e(parcel, 4, this.f4276x);
        e7.e(parcel, 5, this.f4277y);
        e7.d(parcel, 6, this.f4278z, i);
        e7.e(parcel, 7, this.A);
        e7.j(parcel, 8, 8);
        parcel.writeLong(this.B);
        e7.e(parcel, 9, this.C);
        e7.i(parcel, this.D, 10);
        e7.e(parcel, 11, this.E);
        e7.e(parcel, 12, this.F);
        e7.l(parcel, k3);
    }
}
