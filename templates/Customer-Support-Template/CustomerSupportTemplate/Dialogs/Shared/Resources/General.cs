﻿// <auto-generated>
// Code generated by LUISGen C:\Users\lamil\source\repos\CAISolutions\CustomerSupportTemplate\CustomerSupportTemplate\DeploymentScripts\msbotClone\120.luis -cs Luis.General -o C:\Users\lamil\source\repos\CAISolutions\CustomerSupportTemplate\CustomerSupportTemplate\DeploymentScripts\..\Dialogs\Shared\Resources
// Tool github: https://github.com/microsoft/botbuilder-tools
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>
using Newtonsoft.Json;
using System.Collections.Generic;
namespace Luis
{
    public class General : Microsoft.Bot.Builder.IRecognizerConvert
    {
        public string Text;
        public string AlteredText;
        public enum Intent
        {
            Cancel,
            ConfirmMore,
            ConfirmNo,
            ConfirmYes,
            Escalate,
            Goodbye,
            Greeting,
            Help,
            Next,
            None,
            Restart
        };
        public Dictionary<Intent, Microsoft.Bot.Builder.IntentScore> Intents;

        public class _Entities
        {

            // Built-in entities
            public Microsoft.Bot.Builder.AI.Luis.DateTimeSpec[] datetime;
            public double[] number;

            // Instance
            public class _Instance
            {
                public Microsoft.Bot.Builder.AI.Luis.InstanceData[] datetime;
                public Microsoft.Bot.Builder.AI.Luis.InstanceData[] number;
            }
            [JsonProperty("$instance")]
            public _Instance _instance;
        }
        public _Entities Entities;

        [JsonExtensionData(ReadData = true, WriteData = true)]
        public IDictionary<string, object> Properties { get; set; }

        public void Convert(dynamic result)
        {
            var app = JsonConvert.DeserializeObject<General>(JsonConvert.SerializeObject(result));
            Text = app.Text;
            AlteredText = app.AlteredText;
            Intents = app.Intents;
            Entities = app.Entities;
            Properties = app.Properties;
        }

        public (Intent intent, double score) TopIntent()
        {
            Intent maxIntent = Intent.None;
            var max = 0.0;
            foreach (var entry in Intents)
            {
                if (entry.Value.Score > max)
                {
                    maxIntent = entry.Key;
                    max = entry.Value.Score.Value;
                }
            }
            return (maxIntent, max);
        }
    }
}