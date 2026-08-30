package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class na1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8629a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8630b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8631c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8632d;
    public Object e;

    public na1(int i) {
        this.f8629a = i;
        switch (i) {
            case 1:
                this.f8630b = null;
                this.f8631c = null;
                this.f8632d = null;
                this.e = x91.f12510k;
                return;
            case 2:
                this.f8630b = new HashMap();
                this.f8631c = new HashMap();
                this.f8632d = new HashMap();
                this.e = new HashMap();
                return;
            case 3:
                this.f8630b = null;
                this.f8631c = null;
                this.f8632d = null;
                this.e = ja1.J;
                return;
            case 4:
                this.f8630b = null;
                this.f8631c = null;
                this.f8632d = null;
                this.e = x91.f12524y;
                return;
            default:
                this.f8630b = null;
                this.f8631c = null;
                this.f8632d = null;
                this.e = w91.f12183j;
                return;
        }
    }

    public void a(int i) {
        switch (this.f8629a) {
            case 0:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f8630b = Integer.valueOf(i);
                return;
            case 1:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f8630b = Integer.valueOf(i);
                return;
            default:
                this.f8630b = Integer.valueOf(i);
                return;
        }
    }

    public void b(wc1 wc1Var) {
        de1 de1Var = new de1(wc1Var.f12215a, yd1.class);
        HashMap hashMap = (HashMap) this.f8630b;
        if (hashMap.containsKey(de1Var)) {
            wc1 wc1Var2 = (wc1) hashMap.get(de1Var);
            if (wc1Var2.equals(wc1Var) && wc1Var.equals(wc1Var2)) {
                return;
            } else {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(de1Var.toString()));
            }
        }
        hashMap.put(de1Var, wc1Var);
    }

    public void c() {
        this.f8631c = 12;
    }

    public void d(int i) {
        switch (this.f8629a) {
            case 0:
                if (i != 12 && i != 16) {
                    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
                }
                this.f8631c = Integer.valueOf(i);
                return;
            default:
                this.f8631c = Integer.valueOf(i);
                return;
        }
    }

    public void e(uc1 uc1Var) {
        uc1Var.getClass();
        ce1 ce1Var = new ce1(yd1.class, uc1Var.f11623a);
        HashMap hashMap = (HashMap) this.f8631c;
        if (hashMap.containsKey(ce1Var)) {
            uc1 uc1Var2 = (uc1) hashMap.get(ce1Var);
            if (uc1Var2.equals(uc1Var) && uc1Var.equals(uc1Var2)) {
                return;
            } else {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ce1Var.toString()));
            }
        }
        hashMap.put(ce1Var, uc1Var);
    }

    public void f() {
        switch (this.f8629a) {
            case 0:
                this.f8632d = 16;
                return;
            default:
                this.f8632d = 16;
                return;
        }
    }

    public void g(nd1 nd1Var) {
        de1 de1Var = new de1(nd1Var.f8674a, zd1.class);
        HashMap hashMap = (HashMap) this.f8632d;
        if (hashMap.containsKey(de1Var)) {
            nd1 nd1Var2 = (nd1) hashMap.get(de1Var);
            if (nd1Var2.equals(nd1Var) && nd1Var.equals(nd1Var2)) {
                return;
            } else {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(de1Var.toString()));
            }
        }
        hashMap.put(de1Var, nd1Var);
    }

    public void h(ld1 ld1Var) {
        ld1Var.getClass();
        ce1 ce1Var = new ce1(zd1.class, ld1Var.f8014a);
        HashMap hashMap = (HashMap) this.e;
        if (hashMap.containsKey(ce1Var)) {
            ld1 ld1Var2 = (ld1) hashMap.get(ce1Var);
            if (ld1Var2.equals(ld1Var) && ld1Var.equals(ld1Var2)) {
                return;
            } else {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ce1Var.toString()));
            }
        }
        hashMap.put(ce1Var, ld1Var);
    }

    public oa1 i() {
        Integer num = (Integer) this.f8630b;
        if (num != null) {
            if (((Integer) this.f8631c) != null) {
                if (((Integer) this.f8632d) != null) {
                    int intValue = num.intValue();
                    int intValue2 = ((Integer) this.f8631c).intValue();
                    ((Integer) this.f8632d).getClass();
                    return new oa1(intValue, intValue2, (w91) this.e);
                }
                androidx.datastore.preferences.protobuf.s1.q("Tag size is not set");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("IV size is not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Key size is not set");
        return null;
    }

    public ra1 j() {
        Integer num = (Integer) this.f8630b;
        if (num != null) {
            if (((Integer) this.f8631c) != null) {
                if (((Integer) this.f8632d) != null) {
                    int intValue = num.intValue();
                    ((Integer) this.f8631c).getClass();
                    ((Integer) this.f8632d).getClass();
                    return new ra1(intValue, (x91) this.e);
                }
                androidx.datastore.preferences.protobuf.s1.q("Tag size is not set");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("IV size is not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Key size is not set");
        return null;
    }

    public ne1 k() {
        Integer num = (Integer) this.f8630b;
        if (num != null) {
            if (((Integer) this.f8631c) != null) {
                if (((me1) this.f8632d) != null) {
                    if (num.intValue() >= 16) {
                        Integer num2 = (Integer) this.f8631c;
                        int intValue = num2.intValue();
                        me1 me1Var = (me1) this.f8632d;
                        if (intValue >= 10) {
                            if (me1Var == me1.f8331b) {
                                if (intValue > 20) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                                }
                            } else if (me1Var == me1.f8332c) {
                                if (intValue > 28) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                                }
                            } else if (me1Var == me1.f8333d) {
                                if (intValue > 32) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                                }
                            } else if (me1Var == me1.e) {
                                if (intValue > 48) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                                }
                            } else if (me1Var == me1.f8334f) {
                                if (intValue > 64) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                                }
                            } else {
                                androidx.datastore.preferences.protobuf.s1.q("unknown hash type; must be SHA256, SHA384 or SHA512");
                                return null;
                            }
                            return new ne1(((Integer) this.f8630b).intValue(), ((Integer) this.f8631c).intValue(), (ja1) this.e, (me1) this.f8632d);
                        }
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f8630b));
                }
                androidx.datastore.preferences.protobuf.s1.q("hash type is not set");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("tag size is not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("key size is not set");
        return null;
    }

    public bj1 l() {
        q91 q91Var = q91.J;
        w91 w91Var = (w91) this.f8630b;
        if (w91Var != null) {
            aj1 aj1Var = (aj1) this.f8631c;
            if (aj1Var != null) {
                q91 q91Var2 = (q91) this.f8632d;
                if (q91Var2 != null) {
                    x91 x91Var = (x91) this.e;
                    if (aj1Var == aj1.f4525c && q91Var2 != q91.H) {
                        androidx.datastore.preferences.protobuf.s1.q("NIST_P256 requires SHA256");
                        return null;
                    }
                    if (aj1Var == aj1.f4526d && q91Var2 != q91.I && q91Var2 != q91Var) {
                        androidx.datastore.preferences.protobuf.s1.q("NIST_P384 requires SHA384 or SHA512");
                        return null;
                    }
                    if (aj1Var == aj1.e && q91Var2 != q91Var) {
                        androidx.datastore.preferences.protobuf.s1.q("NIST_P521 requires SHA512");
                        return null;
                    }
                    return new bj1(w91Var, aj1Var, q91Var2, x91Var);
                }
                androidx.datastore.preferences.protobuf.s1.q("hash type is not set");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("EC curve type is not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("signature encoding is not set");
        return null;
    }

    public na1(zy1 zy1Var, boolean[] zArr) {
        this.f8629a = 7;
        this.f8630b = zy1Var;
        this.f8631c = zArr;
        int i = zy1Var.f13337a;
        this.f8632d = new boolean[i];
        this.e = new boolean[i];
    }

    public /* synthetic */ na1(AudioTrack audioTrack, bl0 bl0Var) {
        this.f8629a = 6;
        this.f8630b = audioTrack;
        this.f8631c = bl0Var;
        Handler p10 = bq0.p();
        this.f8632d = p10;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.qv1
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                na1 na1Var = na1.this;
                if (((qv1) na1Var.e) == null) {
                    return;
                }
                b80.h().execute(new ou1(na1Var, 2, audioRouting));
            }
        };
        this.e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, p10);
    }

    public na1(mw1 mw1Var) {
        this.f8629a = 5;
        this.f8630b = mw1Var;
        this.f8631c = null;
        this.f8632d = uh.f11636a;
        this.e = null;
    }

    public na1(ee1 ee1Var) {
        this.f8629a = 2;
        this.f8630b = new HashMap(ee1Var.f5669a);
        this.f8631c = new HashMap(ee1Var.f5670b);
        this.f8632d = new HashMap(ee1Var.f5671c);
        this.e = new HashMap(ee1Var.f5672d);
    }
}
