package m3;
import f.b;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f20597c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20598d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(String str, Context context, Object obj, int i, int i10) {
        this.f20595a = i10;
        this.f20596b = str;
        this.f20597c = context;
        this.e = obj;
        this.f20598d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20595a) {
            case 0:
                Object[] objArr = {(c) this.e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return b(this.f20596b, this.f20597c, Collections.unmodifiableList(arrayList), this.f20598d);
            default:
                try {
                    return b(this.f20596b, this.f20597c, (List) this.e, this.f20598d);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
