/*
 * Copyright ©2024. Jingfeng Wu.
 */

package extend;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsageData {
    private double timestamp;
    private double usage;

    public UsageData(double timestamp, double usage) {
        this.timestamp = timestamp;
        this.usage = usage;
    }

}

