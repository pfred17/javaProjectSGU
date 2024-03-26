package icon;

import java.awt.Color;
import javax.swing.JLabel;
import jiconfont.swing.IconFontSwing;
import icon.GoogleMaterialDesignIcons;


public class LableGoogleIcon extends JLabel{
    
    
    
    private GoogleMaterialDesignIcons googleIcon;
    private float iconSize = 35;
    private Color iconColor;
    
    public GoogleMaterialDesignIcons getGoogleIcon() {
        return googleIcon;
    }

    public void setGoogleIcon(GoogleMaterialDesignIcons googleIcon) {
        this.googleIcon = googleIcon;
        initIcon();
    }

    public float getIconSize() {
        return iconSize;
    }

    public void setIconSize(int iconSize) {
        this.iconSize = iconSize;
        initIcon();
    }

    public Color getIconColor() {
        return iconColor;
    }

    public void setIconColor(Color iconColor) {
        this.iconColor = iconColor;
        initIcon();
    }
    
    private void initIcon() {
        if (googleIcon != null) {
            IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
            setIcon(IconFontSwing.buildIcon(googleIcon, iconSize, iconColor));
        }
    }
}
