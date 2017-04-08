package autoModes;

public class TestAroundAirShip {
	public static double [][] heading = new double [][] {
		{0.0, 0.0},
		{0.1, 0.27499594724496446},
		{0.2, 0.36621287846422085},
		{0.30000000000000004, 0.5214335296342262},
		{0.4, 0.7626135184744716},
		{0.5, 1.1284040700344156},
		{0.6, 1.6732097540248707},
		{0.7, 2.4624911301491044},
		{0.7999999999999999, 3.6084874398063063},
		{0.8999999999999999, 5.255853525045399},
		{0.9999999999999999, 7.541639555291094},
		{1.0999999999999999, 10.716078947113365},
		{1.2, 15.021653322565195},
		{1.3, 20.405537118534237},
		{1.4000000000000001, 26.930999324023077},
		{1.5000000000000002, 34.18133007957327},
		{1.6000000000000003, 40.45012408106594},
		{1.7000000000000004, 45.45717978316974},
		{1.8000000000000005, 49.366588714266115},
		{1.9000000000000006, 52.2013547339557},
		{2.0000000000000004, 54.22024217705162},
		{2.1000000000000005, 55.66472350471457},
		{2.2000000000000006, 56.66475781935471},
		{2.3000000000000007, 57.35133754942433},
		{2.400000000000001, 57.82426140115667},
		{2.500000000000001, 58.141348480716196},
		{2.600000000000001, 58.35022654971422},
		{2.700000000000001, 58.48457935117023},
		{2.800000000000001, 58.5635045566502},
		{2.9000000000000012, 58.59981214562489},
		{3.0000000000000013, 58.59981214562489},
		};

		public static double [][] leftVelocity = new double [][] {
		{0.0, 0.0},
		{0.1, 2.6095388972392386},
		{0.2, 3.73471776771757},
		{0.30000000000000004, 4.357532050657616},
		{0.4, 4.690831112045604},
		{0.5, 4.853165530400191},
		{0.6, 4.909621696495914},
		{0.7, 4.894953772429494},
		{0.7999999999999999, 4.826431875272332},
		{0.8999999999999999, 4.7131349273690315},
		{0.9999999999999999, 4.561881027349674},
		{1.0999999999999999, 4.379689894704781},
		{1.1999999999999997, 4.183067130683346},
		{1.2999999999999998, 4.002394585662982},
		{1.4, 3.8703869983803267},
		{1.5, 3.8338332925162346},
		{1.6, 3.9318649442767435},
		{1.7000000000000002, 4.12019547872023},
		{1.8000000000000003, 4.349600070450417},
		{1.9000000000000004, 4.587077815201896},
		{2.0000000000000004, 4.802522190152301},
		{2.1000000000000005, 4.9800295977728215},
		{2.2000000000000006, 5.113232998368236},
		{2.3000000000000007, 5.19558805858204},
		{2.400000000000001, 5.2179105670179675},
		{2.500000000000001, 5.16209281763967},
		{2.600000000000001, 4.991137705511475},
		{2.700000000000001, 4.635379573165822},
		{2.800000000000001, 3.9676225609610665},
		{2.9000000000000012, 2.759245058624143},
		{3.0000000000000013, 0.0},
		};

		public static double [][] rightVelocity = new double [][] {
		{0.0, 0.0},
		{0.1, 2.641100324152384},
		{0.2, 3.7961875398809193},
		{0.30000000000000004, 4.456083435265595},
		{0.4, 4.837852589450721},
		{0.5, 5.065262850777703},
		{0.6, 5.209234395422974},
		{0.7, 5.3109117984963},
		{0.7999999999999999, 5.395236232422312},
		{0.8999999999999999, 5.47684513446081},
		{0.9999999999999999, 5.563738349665651},
		{1.0999999999999999, 5.661119075624438},
		{1.1999999999999997, 5.765722217510781},
		{1.2999999999999998, 5.8647061783131145},
		{1.4, 5.947299187211828},
		{1.5, 5.987410162833638},
		{1.6, 5.958237677255539},
		{1.7000000000000002, 5.8970173503455285},
		{1.8000000000000003, 5.831062637850027},
		{1.9000000000000004, 5.768162702023934},
		{2.0000000000000004, 5.714602507656267},
		{2.1000000000000005, 5.668546619534642},
		{2.2000000000000006, 5.622173972139578},
		{2.3000000000000007, 5.565630420211567},
		{2.400000000000001, 5.483319194185473},
		{2.500000000000001, 5.349443882275091},
		{2.600000000000001, 5.120820061750236},
		{2.700000000000001, 4.722330092505116},
		{2.800000000000001, 4.022018479225366},
		{2.9000000000000012, 2.7874659803581383},
		{3.0000000000000013, 0.0},
		};

		public static double [][] leftPath = new double [][] {
		{-0.004448339752588269, 1.0937409541447396},
		{0.4605053051802318, 1.095631667680082},
		{0.9243550195453629, 1.0978565846585475},
		{1.3866272711388983, 1.1008072799401978},
		{1.8466547091240266, 1.1049842914943993},
		{2.30336847221949, 1.111041272256343},
		{2.7552550862949152, 1.119892588933996},
		{3.2003936929292753, 1.1327918559559214},
		{3.63575024931593, 1.1512954151940615},
		{4.057315541012975, 1.177427796124495},
		{4.460834104145801, 1.2136735674254213},
		{4.839718932436384, 1.2621419247247196},
		{5.187315679043239, 1.3247805158913009},
		{5.502728950909445, 1.4044271077608714},
		{5.784492221965505, 1.5016845880521865},
		{6.040358053167327, 1.6218576839449295},
		{6.296927464599656, 1.7881943098767428},
		{6.557867501039259, 2.0051807753571103},
		{6.820760466103906, 2.2686746638523116},
		{7.085512150391597, 2.575146216793077},
		{7.350391458950319, 2.915535489042991},
		{7.614341343082532, 3.281189215373259},
		{7.8774609650178, 3.6661031152380925},
		{8.139788872940363, 4.064781483840032},
		{8.401420847295029, 4.473050437177377},
		{8.662594796438373, 4.888145905745218},
		{8.923467424696248, 5.307916503676197},
		{9.184159712827055, 5.730836373104872},
		{9.444804448608869, 6.1559110965538},
		{9.705518843985404, 6.582418286158378},
		{9.96643068385347, 7.009857345701275},
		};

		public static double [][] rightPath = new double [][] {
		{0.004448339752588403, -1.0937409541447396},
		{0.4710043564218227, -1.0918431367286514},
		{0.9383365941742736, -1.0895987327298773},
		{1.4065348474145887, -1.0866021326771174},
		{1.8757697299790734, -1.0823219434806233},
		{2.3464471136026672, -1.0760345107600076},
		{2.8191276114869757, -1.0666747094873426},
		{3.2943803913999603, -1.0526881257667626},
		{3.773427912475189, -1.0318676824848563},
		{4.257697875455956, -1.0008750225954328},
		{4.7479362332747925, -0.9549039888195936},
		{5.246467843312427, -0.8872095061727858},
		{5.7542808343810234, -0.7879681115210575},
		{6.265428444224261, -0.6458035458235787},
		{6.775248468876778, -0.44858675440411044},
		{7.26932583364066, -0.18778162944281007},
		{7.716146554597576, 0.1235702007801951},
		{8.116956550986796, 0.47077614021887815},
		{8.480836033109304, 0.8441377700402528},
		{8.814007940560762, 1.234452906088694},
		{9.125045523717823, 1.6365674673926556},
		{9.42067204939647, 2.04736360799295},
		{9.705050504337958, 2.4639913376701603},
		{9.98165185135509, 2.884655635150481},
		{10.25296182376005, 3.308167497792068},
		{10.52055409696598, 3.7335275759136826},
		{10.785623657509788, 4.160079226622657},
		{11.049002385786702, 4.587368815581388},
		{11.311220483716271, 5.015013452637414},
		{11.572657476278463, 5.442703594755829},
		{11.83356931614653, 5.870142654298726},
		};
}