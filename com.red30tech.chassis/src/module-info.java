import com.red30tech.chassis.api.Chassis;
import com.red30tech.chassis.type.SedanChassis;
import com.red30tech.chassis.type.SuvChassis;

module com.red30tech.chassis {
    requires com.red30tech.axle;
    requires static com.red30tech.airbag;
    exports com.red30tech.chassis.api;
    opens com.red30tech.chassis.type;
    provides Chassis with SuvChassis, SedanChassis;
}
