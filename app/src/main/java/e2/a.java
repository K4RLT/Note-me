package e2;

import a2.c;
import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.m0;
import q.x;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f15891a;

    public a(m0 m0Var) {
        this.f15891a = m0Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        m0 m0Var = this.f15891a;
        m0Var.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            df.a aVar = (df.a) m0Var.f18664w;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            df.a aVar2 = (df.a) m0Var.f18665x;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            df.a aVar3 = (df.a) m0Var.f18666y;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == 3) {
            df.a aVar4 = (df.a) m0Var.f18667z;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else if (itemId == 4) {
            df.a aVar5 = (df.a) m0Var.A;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        m0 m0Var = this.f15891a;
        m0Var.getClass();
        if (menu != null) {
            if (actionMode != null) {
                if (((df.a) m0Var.f18664w) != null) {
                    m0.a(menu, b.Copy);
                }
                if (((df.a) m0Var.f18665x) != null) {
                    m0.a(menu, b.Paste);
                }
                if (((df.a) m0Var.f18666y) != null) {
                    m0.a(menu, b.Cut);
                }
                if (((df.a) m0Var.f18667z) != null) {
                    m0.a(menu, b.SelectAll);
                }
                if (((df.a) m0Var.A) != null && Build.VERSION.SDK_INT >= 26) {
                    m0.a(menu, b.Autofill);
                    return true;
                }
                return true;
            }
            x.n("onCreateActionMode requires a non-null mode");
            return false;
        }
        x.n("onCreateActionMode requires a non-null menu");
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((c) this.f15891a.f18662u).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        j1.c cVar = (j1.c) this.f15891a.f18663v;
        if (rect != null) {
            rect.set((int) cVar.f18763a, (int) cVar.f18764b, (int) cVar.f18765c, (int) cVar.f18766d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        m0 m0Var = this.f15891a;
        m0Var.getClass();
        if (actionMode != null && menu != null) {
            m0.b(menu, b.Copy, (df.a) m0Var.f18664w);
            m0.b(menu, b.Paste, (df.a) m0Var.f18665x);
            m0.b(menu, b.Cut, (df.a) m0Var.f18666y);
            m0.b(menu, b.SelectAll, (df.a) m0Var.f18667z);
            m0.b(menu, b.Autofill, (df.a) m0Var.A);
            return true;
        }
        return false;
    }
}
