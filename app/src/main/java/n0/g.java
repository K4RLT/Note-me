package n0;
import m.f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import qe.q;

/* loaded from: classes.dex */
public final class g extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public final int f20981u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f20982v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f20983w;

    /* renamed from: x, reason: collision with root package name */
    public final j6.l f20984x;

    /* renamed from: y, reason: collision with root package name */
    public int f20985y;

    public g(Context context) {
        super(context);
        this.f20981u = 5;
        ArrayList arrayList = new ArrayList();
        this.f20982v = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f20983w = arrayList2;
        this.f20984x = new j6.l();
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f20985y = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i a(h hVar) {
        View view;
        j6.l lVar = this.f20984x;
        LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f18933v;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) lVar.f18933v;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) lVar.f18934w;
        i iVar = (i) linkedHashMap.get(hVar);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = (i) q.p(this.f20983w);
        i iVar3 = iVar2;
        if (iVar2 == null) {
            int i = this.f20985y;
            ArrayList arrayList = this.f20982v;
            if (i > qe.f(arrayList)) {
                View view2 = new View(getContext());
                addView(view2);
                arrayList.add(view2);
                view = view2;
            } else {
                i iVar4 = (i) arrayList.get(this.f20985y);
                h hVar2 = (h) linkedHashMap3.get(iVar4);
                view = iVar4;
                if (hVar2 != null) {
                    hVar2.Q();
                    i iVar5 = (i) linkedHashMap2.get(hVar2);
                    if (iVar5 != null) {
                    }
                    linkedHashMap2.remove(hVar2);
                    iVar4.c();
                    view = iVar4;
                }
            }
            int i10 = this.f20985y;
            if (i10 < this.f20981u - 1) {
                this.f20985y = i10 + 1;
                iVar3 = view;
            } else {
                this.f20985y = 0;
                iVar3 = view;
            }
        }
        linkedHashMap2.put(hVar, iVar3);
        linkedHashMap3.put(iVar3, hVar);
        return iVar3;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i10, int i11, int i12) {
    }
}
